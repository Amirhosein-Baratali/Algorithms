package com.example.algorithms.merge_sorted_array

import org.junit.Test


class MergeSortedArrayTest {

    private val solver = MergeSortedArray()

    @Test
    fun mergedArrays_giveSortedArrayInResult_case1() {
        val nums1 = intArrayOf(1, 2, 3, 0, 0, 0)
        val m = 3
        val nums2 = intArrayOf(2, 5, 6)
        val n = 3
        val expected = intArrayOf(1, 2, 2, 3, 5, 6)
        solver.merge(nums1, m, nums2, n)
        assert(expected contentEquals nums1)
    }

    @Test
    fun mergedArrays_giveSortedArrayInResult_case2() {
        val nums1 = intArrayOf(1)
        val m = 1
        val nums2 = intArrayOf()
        val n = 0
        val expected = intArrayOf(1)
        solver.merge(nums1, m, nums2, n)
        assert(expected contentEquals nums1)
    }

    @Test
    fun mergedArrays_giveSortedArrayInResult_case3() {
        val nums1 = intArrayOf(0)
        val m = 0
        val nums2 = intArrayOf(1)
        val n = 1
        val expected = intArrayOf(1)
        solver.merge(nums1, m, nums2, n)
        assert(expected contentEquals nums1)
    }
}