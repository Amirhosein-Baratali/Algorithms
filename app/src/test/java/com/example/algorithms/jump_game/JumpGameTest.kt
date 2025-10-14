package com.example.algorithms.jump_game

import kotlin.test.Test
import kotlin.test.assertEquals

class JumpGameTest {

    val solver = JumpGame()

    @Test
    fun example1() {
        val nums = intArrayOf(2, 3, 1, 1, 4)
        val expected = true
        val actual = solver.canJump(nums)
        assertEquals(expected, actual)
    }

    @Test
    fun example2() {
        val nums = intArrayOf(3, 2, 1, 0, 4)
        val expected = false
        val actual = solver.canJump(nums)
        assertEquals(expected, actual)
    }

    @Test
    fun example3() {
        val nums = intArrayOf(0)
        val expected = true
        val actual = solver.canJump(nums)
        assertEquals(expected, actual)
    }

    @Test
    fun example4() {
        val nums = intArrayOf(0, 1)
        val expected = false
        val actual = solver.canJump(nums)
        assertEquals(expected, actual)
    }

    @Test
    fun example5() {
        val nums = intArrayOf(2, 0, 0)
        val expected = true
        val actual = solver.canJump(nums)
        assertEquals(expected, actual)
    }

    @Test
    fun example6() {
        val nums = intArrayOf(3, 2, 1, 0, 4)
        val expected = false
        val actual = solver.canJump(nums)
        assertEquals(expected, actual)
    }

    @Test
    fun example7() {
        val nums = intArrayOf(1, 1, 2, 2, 0, 1, 1)
        val expected = true
        val actual = solver.canJump(nums)
        assertEquals(expected, actual)
    }
}