package com.example.algorithms.jump_game_II

class JumpGameII {
    fun jump(nums: IntArray): Int {
        var jumps = 0
        var currentJumpEnd = 0
        var farthestJump = 0
        nums.forEachIndexed { index, num ->
            if (index == nums.lastIndex) return@forEachIndexed
            farthestJump = maxOf(farthestJump, index + num)

            if (index == currentJumpEnd) {
                jumps++
                currentJumpEnd = farthestJump
            }
        }
        return jumps
    }
}