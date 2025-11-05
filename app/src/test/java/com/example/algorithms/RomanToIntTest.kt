package com.example.algorithms

import com.example.algorithms.roman_to_int.RomanToInt
import kotlin.test.Test

class RomanToIntTest {

    val solver = RomanToInt()

    @Test
    fun case1() {
        val input = "III"
        val expected = 3
        val actual = solver.romanToInt(input)
        assert(expected == actual)
    }

    @Test
    fun case2() {
        val input = "LVIII"
        val expected = 58
        val actual = solver.romanToInt(input)
        assert(expected == actual)
    }

    @Test
    fun case3() {
        val input = "MCMXCIV"
        val expected = 1994
        val actual = solver.romanToInt(input)
        assert(expected == actual)
    }

    @Test
    fun case4() {
        val input = "IX"
        val expected = 9
        val actual = solver.romanToInt(input)
        assert(expected == actual)
    }
}