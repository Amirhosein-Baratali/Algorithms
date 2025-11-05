package com.example.algorithms.length_of_last_word

class LengthOfLastWord {

    // my way
    /*
        fun lengthOfLastWord(s: String): Int {
            var lastWordLength = 0

            s.trim().forEach {
                if (it != ' ')
                    lastWordLength++
                else lastWordLength = 0
            }

            return lastWordLength
        }
    */

    // jadi way
    fun lengthOfLastWord(s: String): Int {
        var i = s.length
        var answer = 0
        while (i-- > 0) {
            if (s[i] != ' ')
                answer++
            else if (answer != 0)
                break
        }
        return answer
    }
}