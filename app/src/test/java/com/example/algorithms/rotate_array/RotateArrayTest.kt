package com.example.algorithms.rotate_array

import kotlin.test.Test

class RotateArrayTest {

    val solver = RotateArray()

    @Test
    fun rotateArray_case1() {
        val nums = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        val k = 3
        val expected = intArrayOf(5, 6, 7, 1, 2, 3, 4)
        solver.rotate(nums, k)
        assert(expected.contentEquals(nums))
    }

    @Test
    fun rotateArray_case2() {
        val nums = intArrayOf(-1, -100, 3, 99)
        val k = 2
        val expected = intArrayOf(3, 99, -1, -100)
        solver.rotate(nums, k)
        assert(expected.contentEquals(nums))
    }

    @Test
    fun rotateArray_case3() {
        val nums = intArrayOf(1, 2)
        val k = 7
        val expected = intArrayOf(2, 1)
        solver.rotate(nums, k)
        assert(expected.contentEquals(nums))
    }
}