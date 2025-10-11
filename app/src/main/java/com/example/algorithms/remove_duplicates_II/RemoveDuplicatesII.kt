package com.example.algorithms.remove_duplicates_II

class RemoveDuplicatesII {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.size < 3) return nums.size
        var twoPrevious = nums[0]
        var previous = nums[1]
        var writer = 2
        for (reader in 2 until nums.size) {
            if (nums[reader] != previous || nums[reader] != twoPrevious) {
                previous = nums[reader]
                twoPrevious = nums[reader - 1]
                nums[writer] = nums[reader]
                writer++
            }
        }
        return writer
    }
}