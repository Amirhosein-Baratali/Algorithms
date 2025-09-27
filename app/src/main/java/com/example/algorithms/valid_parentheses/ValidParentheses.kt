package com.example.algorithms.valid_parentheses

class ValidParentheses {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()
        for (c in s) {
            when (c) {
                '[', '{', '(' -> stack.addLast(c)
                ']' -> if (stack.isEmpty() || stack.removeLast() != '[') return false
                '}' -> if (stack.isEmpty() || stack.removeLast() != '{') return false
                ')' -> if (stack.isEmpty() || stack.removeLast() != '(') return false
            }
        }
        return stack.isEmpty()
    }
}