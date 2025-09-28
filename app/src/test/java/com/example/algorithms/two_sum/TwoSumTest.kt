package com.example.algorithms.two_sum

import org.junit.Assert.assertTrue
import org.junit.Test


class TwoSumTest {

    private val solver = TwoSum()

    @Test
    fun givenArray_whenTwoNumbersSumToTarget_thenReturnTheirIndices_case1() {
        val numbers = intArrayOf(2, 7, 11, 15)
        val target = 9
        val expected = intArrayOf(0, 1)
        val actual = solver.twoSum(numbers, target)
        assertTrue(expected contentEquals actual)
    }

    @Test
    fun givenArray_whenTwoNumbersSumToTarget_thenReturnTheirIndices_case2() {
        val numbers = intArrayOf(3, 2, 4)
        val target = 6
        val expected = intArrayOf(1, 2)
        val actual = solver.twoSum(numbers, target)
        assertTrue(expected contentEquals actual)
    }

    @Test
    fun givenArray_whenTwoIdenticalNumbersSumToTarget_thenReturnTheirIndices() {
        val numbers = intArrayOf(3, 3)
        val target = 6
        val expected = intArrayOf(0, 1)
        val actual = solver.twoSum(numbers, target)
        assertTrue(expected contentEquals actual)
    }
}