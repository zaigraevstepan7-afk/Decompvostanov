package com.antigravity.core.api

data class GeminiModel(
    val id: String,
    val title: String,
    val description: String,
    val wireIds: List<String> = listOf(id),
    val thinkingLevel: String? = thinkingLevelFromId(id),
)

data class ResolvedModel(
    val pickerId: String,
    val wireIds: List<String>,
    val thinkingLevel: String?,
)

object GeminiModels {
    val ALL = listOf(
        flashHigh("gemini-3.8-flash", "Gemini 3.8 Flash", "Новейший Flash"),
        flashHigh("gemini-3.7-flash", "Gemini 3.7 Flash", "Flash 3.7 High"),
        flashHigh("gemini-3.6-flash", "Gemini 3.6 Flash", "Flash 3.6 High"),
        GeminiModel("gemini-3.5-flash-lite", "Gemini 3.5 Flash Lite", "Лёгкий 3.5"),
        GeminiModel("gemini-3.5-flash-low", "Gemini 3.5 Flash Low", "3.5 thinking low", thinkingLevel = "low"),
        GeminiModel(
            "gemini-3-flash-agent",
            "Gemini 3.5 Flash High",
            "Агентный 3.5 (внутренний id)",
            thinkingLevel = "high",
        ),
        GeminiModel("gemini-pro-agent", "Gemini 3.1 Pro High", "Pro 3.1, высокий thinking", thinkingLevel = "high"),
        GeminiModel("gemini-3.1-pro-low", "Gemini 3.1 Pro Low", "Pro 3.1, экономный thinking", thinkingLevel = "low"),
        GeminiModel("gemini-3.1-flash-lite", "Gemini 3.1 Flash Lite", "Быстрый 3.1 Lite"),
        GeminiModel(
            "gemini-3.5-flash",
            "Gemini 3.5 Flash",
            "Каноническое имя 3.5",
            wireIds = listOf("gemini-3-flash-agent", "gemini-3.5-flash-low"),
            thinkingLevel = "high",
        ),
        GeminiModel("gemini-3-pro-high", "Gemini 3 Pro High", "Pro 3 High", thinkingLevel = "high"),
        GeminiModel("gemini-3-pro-low", "Gemini 3 Pro Low", "Pro 3 Low", thinkingLevel = "low"),
        GeminiModel("gemini-3-flash", "Gemini 3 Flash (старая)", "Часто упирается в лимит 429"),
        GeminiModel("gemini-2.5-pro", "Gemini 2.5 Pro", "Стабильный Pro"),
        GeminiModel("gemini-2.5-flash", "Gemini 2.5 Flash", "Стабильный Flash"),
        GeminiModel("claude-sonnet-4-6", "Claude Sonnet 4.6", "Cloud Code Assist"),
        GeminiModel("claude-opus-4-6-thinking", "Claude Opus 4.6 Thinking", "Cloud Code Assist"),
        GeminiModel("gpt-oss-120b-medium", "GPT-OSS 120B", "Cloud Code Assist"),
    )

    val DEFAULT = "gemini-3.8-flash-high"

    fun titleOf(id: String): String = ALL.firstOrNull { it.id == id }?.title ?: id

    fun shortTitle(id: String): String {
        val title = titleOf(id)
            .removePrefix("Gemini ")
            .removeSuffix(" (старая)")
            .replace(" Thinking", "")
        return if (title.length > 16) title.take(14) + "…" else title
    }

    fun ids(): List<String> = ALL.map { it.id }

    fun resolve(id: String): ResolvedModel {
        val trimmed = id.trim().ifBlank { DEFAULT }
        ALL.firstOrNull { it.id.equals(trimmed, ignoreCase = true) }?.let { known ->
            return ResolvedModel(
                pickerId = known.id,
                wireIds = known.wireIds.ifEmpty { listOf(known.id) }.distinct(),
                thinkingLevel = known.thinkingLevel,
            )
        }
        return ResolvedModel(
            pickerId = trimmed,
            wireIds = inferredWireIds(trimmed),
            thinkingLevel = thinkingLevelFromId(trimmed),
        )
    }

    private fun flashHigh(base: String, title: String, description: String) = GeminiModel(
        id = "$base-high",
        title = title,
        description = description,
        wireIds = listOf("$base-high", "$base-tiered"),
        thinkingLevel = "high",
    )
}

internal fun thinkingLevelFromId(id: String): String? = when {
    id.endsWith("-high") -> "high"
    id.endsWith("-medium") -> "medium"
    id.endsWith("-low") -> "low"
    else -> null
}

internal fun inferredWireIds(id: String): List<String> {
    val wires = mutableListOf(id)
    val match = Regex("""^(gemini-\d+(?:\.\d+)?-flash)-(low|medium|high)$""").matchEntire(id)
    if (match != null) {
        wires += "${match.groupValues[1]}-tiered"
    }
    return wires.distinct()
}
