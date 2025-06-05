package Kotlin

class Solution_17 {
    val phoneArray = listOf("abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz")
    fun letterCombinations(digits: String): List<String> {
        var res = mutableListOf<String>()
        val len = digits.length
        var tmp = ""
        fun search(ans: String, index: Int) {
            if(tmp.length == digits.length) {
                res.add(tmp)
                return
            }
            for(x in phoneArray[digits[index] - '2']) {
                tmp += x
                search(tmp, index + 1)
                tmp = tmp.substring(0, tmp.length - 1)
            }
        }

        search(tmp, 0)
        // return res
        if(digits.length == 0) {
            return mutableListOf<String>()
        } else {
            return res
        }
    }
}