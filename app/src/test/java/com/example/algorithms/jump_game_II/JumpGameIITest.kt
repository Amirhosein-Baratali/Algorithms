package com.example.algorithms.jump_game_II

import kotlin.test.Test

class JumpGameIITest {

    val solver = JumpGameII()

    @Test
    fun example1() {
        val nums = intArrayOf(2, 3, 1, 1, 4)
        val expected = 2
        val actual = solver.jump(nums)
        assert(expected == actual)
    }

    @Test
    fun example2() {
        val nums = intArrayOf(2, 3, 0, 1, 4)
        val expected = 2
        val actual = solver.jump(nums)
        assert(expected == actual)
    }
}