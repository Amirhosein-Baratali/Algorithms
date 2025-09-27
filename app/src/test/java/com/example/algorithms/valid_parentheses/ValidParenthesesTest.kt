package com.example.algorithms.valid_parentheses

import org.junit.Assert.*
import org.junit.Test

class ValidParenthesesTest {

    private val validator = ValidParentheses()

    @Test
    fun testSimpleParentheses() {
        assertTrue(validator.isValid("()"))
    }

    @Test
    fun testMultipleTypes() {
        assertTrue(validator.isValid("()[]{}"))
    }

    @Test
    fun testMismatched() {
        assertFalse(validator.isValid("(]"))
    }

    @Test
    fun testNestedValid() {
        assertTrue(validator.isValid("([])"))
    }

    @Test
    fun testNestedInvalid() {
        assertFalse(validator.isValid("([)]"))
    }
}
