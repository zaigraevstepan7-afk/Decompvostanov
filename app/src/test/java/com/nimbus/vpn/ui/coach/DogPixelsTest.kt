package com.nimbus.vpn.ui.coach

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class DogPixelsTest {
    @Test
    fun openEyesKeepWhitePixels() {
        val rows = DogPixels.rows(EyePose.OPEN, tuck = false)
        assertEquals(DogPixels.ROWS, rows.size)
        assertTrue(rows.all { it.length == DogPixels.COLS })
        for ((x, y) in DogPixels.eyes) {
            val eye = eye(rows, x, y)
            assertTrue(eye.any { it.contains('6') })
            assertTrue(eye.any { it.contains('1') })
        }
    }

    @Test
    fun shutEyesAreALidWithNoWhite() {
        val rows = DogPixels.rows(EyePose.SHUT, tuck = false)
        for ((x, y) in DogPixels.eyes) {
            val eye = eye(rows, x, y)
            assertTrue(eye.none { it.contains('6') })
            assertTrue(eye.any { row -> row.contains("11111") })
        }
    }

    @Test
    fun halfCloseKeepsTheLowerPupil() {
        val rows = DogPixels.rows(EyePose.HALF, tuck = false)
        for ((x, y) in DogPixels.eyes) {
            val eye = eye(rows, x, y)
            assertFalse(eye[0].contains('6'))
            assertTrue(eye[1].contains("11111"))
            assertTrue(eye[3].contains('1'))
            assertTrue(eye[4].contains('6'))
        }
    }

    @Test
    fun happyEyesAreAnArch() {
        val rows = DogPixels.rows(EyePose.HAPPY, tuck = false)
        for ((x, y) in DogPixels.eyes) {
            val eye = eye(rows, x, y)
            assertEquals("3311113", eye[1])
            assertEquals("3133331", eye[2])
            assertTrue(eye.none { it.contains('6') })
        }
    }

    @Test
    fun tuckLiftsTheFeetByOneCell() {
        val standing = DogPixels.rows(EyePose.OPEN, tuck = false)
        val tucked = DogPixels.rows(EyePose.OPEN, tuck = true)
        assertEquals(standing[33], tucked[32])
        assertTrue(tucked.last().all { it == '.' })
    }

    private fun eye(rows: List<String>, x: Int, y: Int) = List(6) { dy -> rows[y + dy].substring(x, x + 7) }
}
