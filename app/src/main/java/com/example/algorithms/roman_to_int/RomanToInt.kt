package com.example.algorithms.roman_to_int

class RomanToInt {
    // My way
    /*
        fun romanToInt(s: String): Int {
            val values = mapOf(
                'I' to 1,
                'V' to 5,
                'X' to 10,
                'L' to 50,
                'C' to 100,
                'D' to 500,
                'M' to 1000,
            )
            var intAmount = 0
            val substractions = mapOf(
                'I' to listOf('V', 'X'),
                'X' to listOf('L', 'C'),
                'C' to listOf('D', 'M'),
            )

            var decreaser: Char? = null
            s.forEachIndexed { index, ch ->
                if (
                    s.lastIndex != index &&
                    substractions.containsKey(ch) &&
                    substractions[ch]!!.contains(s[index + 1])
                ) {
                    decreaser = ch
                } else {
                    val dec: Int = decreaser?.let { values[it] } ?: 0
                    val value = values[ch]!! - dec
                    intAmount += value
                    decreaser = null
                }
            }

            return intAmount
        }
    */

    // jadi way
    fun romanToInt(s: String): Int {
        val values = mapOf(
            "I" to 1,
            "V" to 5,
            "X" to 10,
            "L" to 50,
            "C" to 100,
            "D" to 500,
            "M" to 1000,
            "IV" to 4,
            "IX" to 9,
            "XL" to 40,
            "XC" to 90,
            "CD" to 400,
            "CM" to 900,
        )
        var intAmount = 0
        var i = 0

        while (i < s.length) {
            if (i < s.length - 1 && values.contains(s.substring(i, i + 2))) {
                intAmount += values[s.substring(i, i + 2)] ?: 0
                i += 2
            } else {
                intAmount += values[s[i].toString()] ?: 0
                i++
            }
        }

        return intAmount
    }

}