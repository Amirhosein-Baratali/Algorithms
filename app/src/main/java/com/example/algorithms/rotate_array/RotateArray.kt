package com.example.algorithms.rotate_array

class RotateArray {
    // my way
//    fun rotate(nums: IntArray, k: Int): Unit {
//        var a = k
//        while (a > 0) {
//            var i = nums.size - 1
//            val last = nums.last()
//            while (i > 0) {
//                nums[i] = nums[i - 1]
//                i--
//            }
//            nums[0] = last
//            a--
//        }
//    }

    // chatgpt way
    fun rotate(nums: IntArray, k: Int) {
        if (nums.size == 1) return
        val a = k % nums.size
        nums.reverse()
        nums.reverse(0, a)
        nums.reverse(a, nums.size)
        println(nums)
    }

    //second chatgpt way
/*
    fun rotate(nums: IntArray, k: Int) {
        val n = nums.size
        val steps = k % n
        if (steps == 0) return

        var count = 0
        var start = 0
        while (count < n) {
            var current = start
            var prev = nums[start]
            do {
                val next = (current + steps) % n
                val temp = nums[next]
                nums[next] = prev
                prev = temp
                current = next
                count++
            } while (start != current)
            start++
        }
    }
*/
}