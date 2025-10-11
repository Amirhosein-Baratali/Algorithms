package com.example.algorithms.majority_element

import kotlin.test.Test


class MajorityElementTest {

    val solver = MajorityElement()

    @Test
    fun majorityElement_case1() {
        val nums = intArrayOf(3, 2, 3)
        val expected = 3
        val actual = solver.majorityElement(nums)
        assert(expected == actual)
    }

    @Test
    fun majorityElement_case2() {
        val nums = intArrayOf(2, 2, 1, 1, 1, 2, 2)
        val expected = 2
        val actual = solver.majorityElement(nums)
        assert(expected == actual)
    }

    @Test
    fun majorityElement_case3() {
        val nums = intArrayOf(3, 2, 3)
        val expected = 3
        val actual = solver.majorityElement(nums)
        assert(expected == actual)
    }

    @Test
    fun majorityElement_case4() {
        val nums = intArrayOf(3, 3, 4)
        val expected = 3
        val actual = solver.majorityElement(nums)
        assert(expected == actual)
    }
}