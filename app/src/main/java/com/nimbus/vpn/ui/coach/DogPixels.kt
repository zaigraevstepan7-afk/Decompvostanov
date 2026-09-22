package com.nimbus.vpn.ui.coach

/**
 * The dog redrawn on the same grid as the original pixel picture.
 * Frames swap eye cells. Nothing is rotated or scaled.
 */
internal const val DOG_CELL_DP = 1.8f
internal const val DOG_PAD_TOP = 8

internal object DogPixels {
    const val COLS = 36
    const val ROWS = 40
    const val TAIL_PAD = 10
    private const val LEG_TOP = 32
    private const val TAIL_X = 34

    val eyes = listOf(8 to 8, 21 to 8)

    private val base = listOf(
        ".111111......................111111.",
        "112222111111111111111111111111222211",
        "122211222222233333333332222222112221",
        "122312222222222333333222222222213221",
        "133112222222222233332222222222211331",
        "133122222222222223322222222222221131",
        "111222222333333322223333333222222111",
        ".1122223333344332222334433333222211.",
        "..12223334666433222233466643332221..",
        "..12233346666643322334666664333221..",
        "..12233146116643333334611664133221..",
        "..12233146111643333334611164133221..",
        "..12223346666643333334666664332221..",
        "..12222334666433333333466643332221..",
        "..11222233333333333333333333322211..",
        "..11233222333344333344333322233211..",
        "..11233333333444333344433333333211..",
        ".11112333333444222222444333333211111",
        "..111123333444123333224443333211211.",
        ".1122113333444222222224443333112211.",
        "..12211113344411122111444333112221..",
        ".1122211134444122112214444311123311.",
        "..13223211444443211234444411123331..",
        "..13323311444443111134444411133331..",
        "..14444311144443311334444111234331..",
        "..14444331114411111111441111244431..",
        "..12444432111144333344111112244421..",
        "..12244442211111444411111122224321..",
        "..12324442322241111111142222244221..",
        "..13222222333344444334443322222221..",
        "..13322222333444444444444322222231..",
        "..12321111123441111114444111112221..",
        "..12321...12241......14421...12231..",
        "..13321...12221......14221...12221..",
        "..12221...13221......12221...12321..",
        "..12221...14321......12221...12341..",
        ".113331..113331......122311..133311.",
        ".133331..133431......133331..143331.",
        ".123331..133331......133331..133131.",
        "..11111...1111........1111...11111..",
    )

    private val half = listOf(
        "3222223",
        "3111113",
        "4611664",
        "4611164",
        "4666664",
        "3466643",
    )

    private val shut = listOf(
        "3333333",
        "3222223",
        "3111113",
        "3222223",
        "3333333",
        "3333333",
    )

    private val happy = listOf(
        "3333333",
        "3311113",
        "3133331",
        "3333333",
        "3333333",
        "3333333",
    )

    private val look = listOf(
        "3466643",
        "4666664",
        "4661164",
        "4661114",
        "4666664",
        "3466643",
    )

    private val tailHigh = listOf(
        20 to ".......121",
        21 to "......1221",
        22 to ".....12221",
        23 to "....122221",
        24 to "...1222221",
        25 to "..1222221.",
        26 to ".1222221..",
        27 to "1222221...",
        28 to "112221....",
        29 to "121.......",
    )

    private val tailLevel = listOf(
        27 to "1221....",
        28 to "122221..",
        29 to "11222221",
        30 to ".122221.",
        31 to "..11221.",
    )

    private val tailLow = listOf(
        29 to "121.....",
        30 to "1221....",
        31 to "12221...",
        32 to ".122221.",
        33 to "..1222221",
        34 to "...122221",
        35 to "....11221",
        36 to ".....1221",
    )

    init {
        require(base.size == ROWS)
        require(base.all { it.length == COLS })
    }

    fun rows(pose: EyePose, paws: Paws = Paws.DOWN, tail: Tail = Tail.HIDDEN): List<String> {
        val grid = base.map { it.toCharArray() }.toMutableList()
        val pattern = when (pose) {
            EyePose.OPEN -> null
            EyePose.HALF -> half
            EyePose.SHUT -> shut
            EyePose.HAPPY -> happy
            EyePose.LOOK -> look
        }
        if (pattern != null) {
            for ((x, y) in eyes) {
                for (dy in pattern.indices) {
                    for (dx in pattern[dy].indices) {
                        grid[y + dy][x + dx] = pattern[dy][dx]
                    }
                }
            }
        }
        val lift = when (paws) {
            Paws.DOWN -> 0
            Paws.TUCK -> 4
            Paws.UP -> 8
        }
        if (lift > 0) {
            val src = grid.map { it.copyOf() }
            for (y in LEG_TOP - lift until ROWS - lift) {
                grid[y] = src[y + lift]
            }
            for (y in ROWS - lift until ROWS) {
                grid[y] = CharArray(COLS) { '.' }
            }
        }
        val wide = grid.map { row ->
            CharArray(COLS + TAIL_PAD) { index -> if (index < COLS) row[index] else '.' }
        }
        if (tail != Tail.HIDDEN) paintTail(wide, tail)
        return wide.map { String(it) }
    }

    private fun paintTail(grid: List<CharArray>, tail: Tail) {
        val stamp = when (tail) {
            Tail.HIDDEN -> return
            Tail.HIGH -> tailHigh
            Tail.LEVEL -> tailLevel
            Tail.LOW -> tailLow
        }
        for ((y, line) in stamp) {
            line.forEachIndexed { dx, ch ->
                if (ch == '.') return@forEachIndexed
                val x = TAIL_X + dx
                if (y !in grid.indices || x !in grid[y].indices) return@forEachIndexed
                if (grid[y][x] == '.') grid[y][x] = ch
            }
        }
    }
}

internal enum class EyePose { OPEN, HALF, SHUT, HAPPY, LOOK }

internal enum class Paws { DOWN, TUCK, UP }

internal enum class Tail { HIDDEN, LOW, LEVEL, HIGH }
