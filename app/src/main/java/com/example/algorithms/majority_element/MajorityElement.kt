package com.example.algorithms.majority_element

class MajorityElement {
    // my way (better memory)
    fun majorityElement(nums: IntArray): Int {
        val countMap = mutableMapOf<Int, Int>()
        nums.forEach {
            countMap[it] = countMap.getOrPut(it) { 0 } + 1
        }
        val maxValue = countMap.entries.maxOf { it.value }
        val key = countMap.entries.find { it.value == maxValue }?.key
        return key ?: 0
    }

    // jadi way
    /*
        fun majorityElement(nums: IntArray): Int {
            val countMap = mutableMapOf<Int, Int>()
            val halfLength = nums.size / 2
            nums.forEach {
                countMap[it] = countMap.getOrPut(it) { 0 } + 1
                if (countMap[it]!! > halfLength) {
                    return it
                }
            }
            return -1
        }
    */

    // chatgpt way (faster) and jadi second way :)
    /*
        fun majorityElement(nums: IntArray): Int {
            var count = 0
            var candidate = 0

            for (num in nums) {
                if (count == 0) {
                    candidate = num
                }
                count += if (num == candidate) 1 else -1
            }

            return candidate
        }
    */
}