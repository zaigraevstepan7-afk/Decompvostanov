package com.nimbus.vpn.ui.coach

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class DogPixelsTest {
    @Test
    fun openEyesKeepTheOriginalWhites() {
        val rows = DogPixels.rows(EyePose.OPEN)
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
        val rows = DogPixels.rows(EyePose.SHUT)
        for ((x, y) in DogPixels.eyes) {
            val eye = eye(rows, x, y)
            assertTrue(eye.none { it.contains('6') })
            assertTrue(eye.any { row -> row.contains("11111") })
        }
    }

    @Test
    fun halfCloseKeepsTheLowerPupil() {
        val rows = DogPixels.rows(EyePose.HALF)
        for ((x, y) in DogPixels.eyes) {
            val eye = eye(rows, x, y)
            assertFalse(eye[0].contains('6'))
            assertTrue(eye[1].contains("11111"))
            assertTrue(eye[4].contains('6'))
        }
    }

    @Test
    fun raisedPawsLeaveTheGroundAndKeepTheHead() {
        val standing = DogPixels.rows(EyePose.OPEN)
        val up = DogPixels.rows(EyePose.OPEN, Paws.UP)
        assertEquals(standing[8], up[8])
        assertEquals(standing[32], up[24])
        assertTrue(up.takeLast(8).all { row -> row.all { it == '.' } })
        assertTrue(standing.last().contains('1'))
    }

    private fun eye(rows: List<String>, x: Int, y: Int) = List(6) { dy -> rows[y + dy].substring(x, x + 7) }
}
