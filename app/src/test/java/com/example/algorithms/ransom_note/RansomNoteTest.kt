package com.example.algorithms.ransom_note

import org.junit.Test

class RansomNoteTest {

    val solver = RansomNote()

    @Test
    fun ransomNote_case1() {
        val ransomNote = "a"
        val magazine = "b"
        assert(!solver.canConstruct(ransomNote, magazine))
    }

    @Test
    fun ransomNote_case2() {
        val ransomNote = "aa"
        val magazine = "ab"
        assert(!solver.canConstruct(ransomNote, magazine))
    }

    @Test
    fun ransomNote_case3() {
        val ransomNote = "aa"
        val magazine = "aab"
        assert(solver.canConstruct(ransomNote, magazine))
    }

    @Test
    fun ransomNote_case4() {
        val ransomNote = "aab"
        val magazine = "baa"
        assert(solver.canConstruct(ransomNote, magazine))
    }
}