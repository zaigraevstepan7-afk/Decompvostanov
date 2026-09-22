package com.nimbus.vpn.ui.coach

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class DogPixelsTest {
    @Test
    fun sitShowsWhiteChestDarkEyesAndFeet() {
        val rows = DogPixels.rows(DogFrame.SIT)
        val picture = rows.joinToString("")
        assertTrue(picture.contains('5'))
        assertTrue(picture.contains('6'))
        assertTrue(rows[rows.lastIndex - 1].contains('1'))
    }

    @Test
    fun blinkRemovesTheCatchlight() {
        assertFalse(DogPixels.rows(DogFrame.BLINK).joinToString("").contains('6'))
    }

    @Test
    fun jumpPutsPawsAboveTheHead() {
        val peak = DogPixels.rows(DogFrame.PEAK)
        assertTrue(peak.first().contains('2'))
        assertTrue(peak.takeLast(4).all { row -> row.all { it == '.' } })
        val rise = DogPixels.rows(DogFrame.RISE)
        assertTrue(rise.takeLast(4).all { row -> row.all { it == '.' } })
        assertTrue(rise[2].contains('1'))
    }

    @Test
    fun runTucksThePawsUp() {
        val reach = DogPixels.rows(DogFrame.RUN_A)
        val tuck = DogPixels.rows(DogFrame.RUN_B)
        assertTrue(reach[16].contains('1'))
        assertTrue(tuck[15].contains('1'))
        assertTrue(tuck[16].all { it == '.' })
        assertTrue(reach.joinToString("").contains('5'))
    }

    @Test
    fun everyFrameIsRectangular() {
        for (frame in DogFrame.entries) {
            val rows = DogPixels.rows(frame)
            val width = rows.first().length
            assertTrue(frame.name, rows.all { it.length == width })
        }
    }
}
