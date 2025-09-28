package com.example.algorithms.two_sum

class TwoSum {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        val seen = java.util.HashMap<Int, Int>(numbers.size)

        for (i in numbers.indices) {
            val diff = target - numbers[i]
            val j = seen[diff]
            if (j != null) {
                return intArrayOf(j, i)
            }
            seen[numbers[i]] = i
        }

        return intArrayOf()
    }
}