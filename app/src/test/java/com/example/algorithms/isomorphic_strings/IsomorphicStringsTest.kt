package com.example.algorithms.isomorphic_strings

import org.junit.Test

class IsomorphicStringsTest {

    val solver = IsomorphicStrings()

    @Test
    fun testIsomorphic_case1() {
        val s = "egg"
        val t = "add"
        assert(solver.isIsomorphic(s, t))
    }

    @Test
    fun testIsomorphic_case2() {
        val s = "foo"
        val t = "bar"
        assert(!solver.isIsomorphic(s, t))
    }

    @Test
    fun testIsomorphic_case3() {
        val s = "paper"
        val t = "title"
        assert(solver.isIsomorphic(s, t))
    }

    @Test
    fun testIsomorphic_case4() {
        val s = "badc"
        val t = "baba"
        assert(!solver.isIsomorphic(s, t))
    }

    @Test
    fun testIsomorphic_case5() {
        val s = "a"
        val t = "a"
        assert(solver.isIsomorphic(s, t))
    }

    @Test
    fun testIsomorphic_case6() {
        val s = "aaeaa"
        val t = "uuxyy"
        assert(!solver.isIsomorphic(s, t))
    }
}