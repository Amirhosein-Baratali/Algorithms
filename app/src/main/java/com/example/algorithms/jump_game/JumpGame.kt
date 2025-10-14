package com.example.algorithms.jump_game

class JumpGame {
    fun canJump(nums: IntArray): Boolean {
        if (nums.contains(0).not()) return true
        val size = nums.size
        if (nums[0] == 0) return size == 1
        var temp = nums[0]
        nums.forEachIndexed { index, num ->
            if (num >= size - index -1) return true
            if (num == 0) {
                if (--temp <= 0) return false
            } else if (num >= temp--) {
                temp = num
            }
        }
        return true
    }
}