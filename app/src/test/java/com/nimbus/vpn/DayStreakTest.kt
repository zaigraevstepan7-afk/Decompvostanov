package com.nimbus.vpn

import com.nimbus.vpn.data.DayStreak
import org.junit.Assert.assertEquals
import org.junit.Test

class DayStreakTest {
    @Test
    fun firstConnectionStartsAtOne() {
        assertEquals(1, DayStreak.next(previous = 0, lastDay = 0, today = 20_000))
    }

    @Test
    fun sameDayDoesNotGrow() {
        assertEquals(4, DayStreak.next(previous = 4, lastDay = 50, today = 50))
    }

    @Test
    fun nextCalendarDayContinues() {
        assertEquals(5, DayStreak.next(previous = 4, lastDay = 50, today = 51))
    }

    @Test
    fun missedDayResets() {
        assertEquals(1, DayStreak.next(previous = 9, lastDay = 50, today = 52))
    }
}
