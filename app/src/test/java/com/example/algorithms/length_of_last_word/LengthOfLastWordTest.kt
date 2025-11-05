package com.example.algorithms.length_of_last_word

import kotlin.test.Test
import kotlin.test.assertEquals

class LengthOfLastWordTest {

    val solver = LengthOfLastWord()

    @Test
    fun test1() {
        val input = "Hello World"
        val expected = 5
        val actual = solver.lengthOfLastWord(input)
        assertEquals(expected, actual)
    }

    @Test
    fun test2() {
        val input = "   fly me   to   the moon  "
        val expected = 4
        val actual = solver.lengthOfLastWord(input)
        assertEquals(expected, actual)
    }

    @Test
    fun test3() {
        val input = "luffy is still joyboy"
        val expected = 6
        val actual = solver.lengthOfLastWord(input)
        assertEquals(expected, actual)
    }

    @Test
    fun test4() {
        val input = "a"
        val expected = 1
        val actual = solver.lengthOfLastWord(input)
        assertEquals(expected, actual)
    }
}