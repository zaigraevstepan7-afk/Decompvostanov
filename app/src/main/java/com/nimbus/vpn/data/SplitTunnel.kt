package com.nimbus.vpn.data

/**
 * Per-app split tunnel. Selected packages are written as `ExcludedApplications`
 * at connect time, so the stored profile stays untouched.
 * An empty selection does not rewrite a line that was already in the config.
 */
object SplitTunnel {
    private val packageName = Regex("""^[A-Za-z][A-Za-z0-9_]*(\.[A-Za-z][A-Za-z0-9_]*)+$""")
    private val excludedLine = Regex("""(?im)^\s*ExcludedApplications\s*=.*$""")
    private val excludedValue = Regex("""(?im)^\s*ExcludedApplications\s*=\s*(.*)$""")
    private val includedLine = Regex("""(?im)^\s*IncludedApplications\s*=.*(?:\n|$)""")

    fun sanitize(packages: Collection<String>): List<String> =
        packages.asSequence()
            .map { it.trim() }
            .filter { packageName.matches(it) }
            .distinct()
            .sorted()
            .toList()

    /**
     * Adds [packages] to `ExcludedApplications`. Names rejected by [keep] are dropped,
     * including names already present in [raw]. Android forbids allowed and disallowed
     * apps on the same VPN builder, so `IncludedApplications` is removed when this writes
     * an exclusion list.
     */
    fun apply(raw: String, packages: Collection<String>, keep: (String) -> Boolean = { true }): String {
        val extra = sanitize(packages).filter(keep)
        if (extra.isEmpty()) return raw
        val text = raw.replace("\r\n", "\n")
        val withoutIncluded = includedLine.replace(text, "")
        val existing = excludedValue.find(withoutIncluded)
        val merged = if (existing != null) {
            sanitize(existing.groupValues[1].split(',') + extra).filter(keep)
        } else {
            extra
        }
        if (merged.isEmpty()) return raw
        val line = "ExcludedApplications = ${merged.joinToString(", ")}"
        val written = if (existing != null) {
            excludedLine.replace(withoutIncluded, line)
        } else {
            insertAfterInterface(withoutIncluded, line)
        }
        return written.replace(Regex("\n{3,}"), "\n\n")
    }

    private fun insertAfterInterface(text: String, line: String): String {
        val lines = text.split('\n').toMutableList()
        val iface = lines.indexOfFirst { it.trim().equals("[Interface]", ignoreCase = true) }
        if (iface < 0) return "[Interface]\n$line\n$text"
        var at = iface + 1
        while (at < lines.size && !lines[at].trim().startsWith("[")) at++
        lines.add(at, line)
        return lines.joinToString("\n")
    }
}
