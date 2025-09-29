package com.example.algorithms.valid_palindrome

class ValidPalindrome {
    /*    fun isPalindrome(s: String): Boolean {
            val input = s.map { it.lowercase() }.joinToString { it }.filter { it.isLetterOrDigit() }
            var start = 0
            var end = input.length - 1
            while (start <= end && start < input.length && end >= 0) {
                if (input[start] == input[end]) {
                    start++
                    end--
                } else {
                    return false
                }
            }
            return true
        }*/
    fun isPalindrome(s: String): Boolean {
        var left = 0
        var right = s.length - 1

        while (left <= right) {
            if (!s[left].isLetterOrDigit()) {
                left++
                continue
            } else if (!s[right].isLetterOrDigit()) {
                right--
                continue
            }


            if (s[left].lowercaseChar() != s[right].lowercaseChar()) {
                return false
            } else {
                left++
                right--
            }
        }

        return true
    }

}