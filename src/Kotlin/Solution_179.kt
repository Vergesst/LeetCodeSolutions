package Kotlin

class Solution_179 {
    fun largestNumber(nums: IntArray): String{
        val strNums = nums.map { it.toString() }
        strNums.sortedWith comparator@{a, b -> (b + a).compareTo(a + b) }.let {
            if(it[0] == "0") return "0"
            return StringBuilder("").apply{
                it.forEach(this::append)
            }.toString()
        }
    }
}