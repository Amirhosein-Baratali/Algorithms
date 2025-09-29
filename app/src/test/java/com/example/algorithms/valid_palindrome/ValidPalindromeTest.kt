package com.example.algorithms.valid_palindrome

import org.junit.Test

class ValidPalindromeTest {

    val solver = ValidPalindrome()

    @Test
    fun isPalindrome_case1() {
        val s = "A man, a plan, a canal: Panama"
        assert(solver.isPalindrome(s))
    }

    @Test
    fun isPalindrome_case2() {
        val s = "race a car"
        assert(!solver.isPalindrome(s))
    }

    @Test
    fun isPalindrome_case3() {
        val s = " "
        assert(solver.isPalindrome(s))
    }
}