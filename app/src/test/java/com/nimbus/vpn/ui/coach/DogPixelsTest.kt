package com.nimbus.vpn.ui.coach

import org.junit.Assert.assertEquals
import org.junit.Assert.assertFalse
import org.junit.Assert.assertNotEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class DogPixelsTest {
    @Test
    fun openEyesKeepTheOriginalWhites() {
        val rows = DogPixels.rows(EyePose.OPEN)
        assertEquals(DogPixels.ROWS, rows.size)
        assertTrue(rows.all { it.length == DogPixels.COLS + DogPixels.TAIL_PAD })
        assertTrue(rows.all { it.drop(DogPixels.COLS).all { cell -> cell == '.' } })
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

    @Test
    fun tailWagStaysOffTheFaceAndChangesShape() {
        val still = DogPixels.rows(EyePose.OPEN)
        val high = DogPixels.rows(EyePose.OPEN, tail = Tail.HIGH)
        val low = DogPixels.rows(EyePose.OPEN, tail = Tail.LOW)
        assertEquals(still[8], high[8])
        assertNotEquals(high.joinToString("\n"), low.joinToString("\n"))
        assertTrue(high.any { it.drop(DogPixels.COLS).any { cell -> cell != '.' } })
        for (y in still.indices) {
            for (x in 0 until DogPixels.COLS) {
                if (still[y][x] != '.') assertEquals(still[y][x], high[y][x])
            }
        }
    }

    @Test
    fun openMouthChangesTheMuzzleAndLeavesTheEyes() {
        val shut = DogPixels.rows(EyePose.OPEN, mouth = Mouth.SHUT)
        val open = DogPixels.rows(EyePose.OPEN, mouth = Mouth.OPEN)
        assertEquals(shut[8], open[8])
        assertEquals("111111", shut[25].substring(15, 21))
        assertEquals("433334", shut[26].substring(15, 21))
        assertEquals("111111", open[26].substring(15, 21))
        assertNotEquals(shut[26], open[26])
    }

    @Test
    fun anotherServerDoesNotReplayTheGearHint() {
        assertEquals(CoachStep.ACCESS, CoachStep.CREATE.afterServerCreated(heardAccess = false))
        assertEquals(CoachStep.ACCESS, CoachStep.PICK.afterServerCreated(heardAccess = true))
        assertEquals(CoachStep.DONE, CoachStep.ACCESS.afterServerCreated(heardAccess = true))
        assertEquals(CoachStep.ACCESS, CoachStep.ACCESS.afterServerCreated(heardAccess = false))
        assertEquals(CoachStep.DONE, CoachStep.CELEBRATE.afterServerCreated(heardAccess = true))
        assertEquals(CoachStep.DONE, CoachStep.DONE.afterServerCreated(heardAccess = true))
        assertEquals(CoachStep.CELEBRATE, CoachStep.CONNECT.afterTunnelUp())
        assertEquals(CoachStep.ACCESS, CoachStep.ACCESS.afterTunnelUp())
        assertEquals(CoachStep.DONE, CoachStep.DONE.afterTunnelUp())
        assertEquals(CoachStep.SETTINGS, CoachStep.SETTINGS.afterTunnelUp())
    }

    private fun eye(rows: List<String>, x: Int, y: Int) = List(6) { dy -> rows[y + dy].substring(x, x + 7) }
}
