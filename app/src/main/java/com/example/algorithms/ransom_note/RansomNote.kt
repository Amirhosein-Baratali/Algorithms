package com.example.algorithms.ransom_note

class RansomNote {
    /*    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val magazineMap = magazine.groupBy { it }.toMutableMap()
        val ransomNoteChars = ransomNote.toMutableList()
        ransomNote.forEach { ransomNoteChar ->
            if (magazineMap[ransomNoteChar] != null && magazineMap[ransomNoteChar]!!.isNotEmpty()) {
                magazineMap[ransomNoteChar] = magazineMap[ransomNoteChar]!!.drop(1)
                ransomNoteChars.remove(ransomNoteChar)
            }
        }
        return ransomNoteChars.isEmpty()
    }*/
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val letters = mutableMapOf<Char, Int>()
        for (c in magazine) {
            if (letters.containsKey(c)) {
                letters[c] = letters[c]!! + 1
            } else {
                letters[c] = 1
            }
        }
        for (c in ransomNote) {
            if (letters.containsKey(c).not()) {
                return false
            }
            if (letters[c] == 0) {
                return false
            }
            letters[c] = letters[c]!! - 1
        }
        return true
    }
/*
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val ransomMap = mutableMapOf<Char, Int>()
        val magazineMap = mutableMapOf<Char, Int>()

        // Count ransomNote chars
        for (c in ransomNote) {
            ransomMap[c] = (ransomMap[c] ?: 0) + 1
        }

        // Count magazine chars
        for (c in magazine) {
            magazineMap[c] = (magazineMap[c] ?: 0) + 1
        }

        // Compare counts
        for ((c, needed) in ransomMap) {
            val available = magazineMap[c] ?: 0
            if (available < needed) {
                return false
            }
        }
        return true
    }
*/
}