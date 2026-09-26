package com.nimbus.vpn.data

object DayStreak {
    fun next(previous: Int, lastDay: Long, today: Long): Int = when {
        lastDay == today -> previous.coerceAtLeast(1)
        lastDay == today - 1L -> (previous + 1).coerceAtLeast(2)
        else -> 1
    }
}
