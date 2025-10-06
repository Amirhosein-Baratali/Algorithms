package com.example.algorithms.remove_element

import kotlin.test.Test


class RemoveElementTest {

    val solver = RemoveElement()

    @Test
    fun testRemoveElement_case1() {
        val nums = intArrayOf(3, 2, 2, 3)
        val va = 3
        val expectedNums = intArrayOf(2, 2)
        val k = solver.removeElement(nums, va)
        assert(k == expectedNums.size)
        nums.sort(0, k)
        for (i in 0 until k) {
            assert(nums[i] == expectedNums[i])
        }
    }

    @Test
    fun testRemoveElement_case2() {
        val nums = intArrayOf(0, 1, 2, 2, 3, 0, 4, 2)
        val va = 2
        val expectedNums = intArrayOf(0, 0, 1, 3, 4)
        val k = solver.removeElement(nums, va)
        assert(k == expectedNums.size)
        nums.sort(0, k)
        for (i in 0 until k) {
            assert(nums[i] == expectedNums[i])
        }
    }
}