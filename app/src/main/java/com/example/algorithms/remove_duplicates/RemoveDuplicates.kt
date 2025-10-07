package com.example.algorithms.remove_duplicates

class RemoveDuplicates {
    // my way (works fine and gives idiot error on submit)
    /*fun removeDuplicates(nums: IntArray): Int {
        var reader = 0
        var writer = 1
        if (nums.size == 1) return 1
        while (reader < nums.size) {
            if (nums[writer] <= nums[writer -1]) {
                nums[writer] = nums[reader]
                reader++
            } else {
                writer++
            }
        }
        val a = nums.dropLast(nums.size - writer -1)
        return writer + 1
    }*/

    // jadi way
    fun removeDuplicates(nums: IntArray): Int {
        var prev = nums[0]
        var iw = 1
        var k = 1
        for (ir in 1 until nums.size) {
            if (nums[ir] != prev) {
                k += 1
                nums[iw] = nums[ir]
                prev = nums[ir]
                iw += 1
            }
        }
        return k
    }
}