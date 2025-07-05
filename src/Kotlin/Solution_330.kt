package Kotlin

class Solution_330 {
    fun possibleStringCount(word: String): Int {
        var res = 0
        word.forEachIndexed { index, ch ->
            if (index != 0 && ch == word[index - 1])
                res += 1
        }

        return res
    }
}