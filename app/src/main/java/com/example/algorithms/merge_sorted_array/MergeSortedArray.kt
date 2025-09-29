package com.example.algorithms.merge_sorted_array

class MergeSortedArray {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var nums1Pointer = m - 1
        var nums2Pointer = n - 1
        var writePointer = m + n - 1

        while (writePointer >= 0) {
            if (nums1Pointer < 0)
                nums1[writePointer--] = nums2[nums2Pointer--]
            else if (nums2Pointer < 0)
                nums1[writePointer--] = nums1[nums1Pointer--]
            else if (nums1[nums1Pointer] > nums2[nums2Pointer])
                nums1[writePointer--] = nums1[nums1Pointer--]
            else
                nums1[writePointer--] = nums2[nums2Pointer--]
        }
    }
}