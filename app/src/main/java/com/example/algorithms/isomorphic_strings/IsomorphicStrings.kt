package com.example.algorithms.isomorphic_strings

class IsomorphicStrings {
    fun isIsomorphic(s: String, t: String): Boolean {
        val charsMap = mutableMapOf<Char, Char>()
        if (s.length != t.length) return false
        for (i in s.indices) {
            if (charsMap.containsKey(s[i]) || charsMap.containsValue(t[i])) {
                if ( charsMap[s[i]] != t[i]) return false
            } else {
                charsMap[s[i]] = t[i]
            }
        }
        return true
    }
}