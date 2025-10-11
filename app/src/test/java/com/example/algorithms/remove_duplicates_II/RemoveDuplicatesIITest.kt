package com.example.algorithms.remove_duplicates_II

import kotlin.test.Test

class RemoveDuplicatesIITest {

    val solver = RemoveDuplicatesII()

    @Test
    fun removeDuplicates_case1() {
        val nums = intArrayOf(1, 1, 1, 2, 2, 3)
        val expected = 5
        val actual = solver.removeDuplicates(nums)
        val expectedNums = intArrayOf(1, 1, 2, 2, 3)
        assert(expected == actual)
        for (i in 0 until actual) {
            assert(expectedNums[i] == nums[i])
        }
    }

    @Test
    fun removeDuplicates_case2() {
        val nums = intArrayOf(0, 0, 1, 1, 1, 1, 2, 3, 3)
        val expected = 7
        val actual = solver.removeDuplicates(nums)
        val expectedNums = intArrayOf(0, 0, 1, 1, 2, 3, 3)
        assert(expected == actual)
        for (i in 0 until actual) {
            assert(expectedNums[i] == nums[i])
        }
    }

    @Test
    fun removeDuplicates_case3() {
        val nums = intArrayOf(1, 2, 2)
        val expected = 3
        val actual = solver.removeDuplicates(nums)
        val expectedNums = intArrayOf(1, 2, 2)
        assert(expected == actual)
        for (i in 0 until actual) {
            assert(expectedNums[i] == nums[i])
        }
    }
}