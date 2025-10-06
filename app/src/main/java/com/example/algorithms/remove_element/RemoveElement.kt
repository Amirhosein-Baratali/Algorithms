package com.example.algorithms.remove_element

class RemoveElement {
    fun removeElement(nums: IntArray, va: Int): Int {
        var reader = 0
        var writer = 0
        var k = 0

        nums.forEach { num ->
            if (num != va) {
                nums[writer] = num
                writer++
                k++
            }
            reader++
        }
        return k
    }
}