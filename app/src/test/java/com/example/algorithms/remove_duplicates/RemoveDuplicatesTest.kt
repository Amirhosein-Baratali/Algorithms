package com.example.algorithms.remove_duplicates

import kotlin.test.Test


class RemoveDuplicatesTest {

    val solver = RemoveDuplicates()

    @Test
    fun removeDuplicates_case1() {
        val nums = intArrayOf(1, 1, 2)
        val k = solver.removeDuplicates(nums)
        val expectedNums = intArrayOf(1, 2)
        assert(k == 2)
        for (i in 0 until k) {
            assert(nums[i] == expectedNums[i])
        }
    }

    @Test
    fun removeDuplicates_case2() {
        val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        val k = solver.removeDuplicates(nums)
        val expectedNums = intArrayOf(0, 1, 2, 3, 4)
        assert(k == 5)
        for (i in 0 until k) {
            assert(nums[i] == expectedNums[i])
        }
    }
}