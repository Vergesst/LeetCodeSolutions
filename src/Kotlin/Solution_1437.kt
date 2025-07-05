package Kotlin

class Solution_1437 {
    fun kLengthApart(nums: IntArray, k: Int): Boolean {
        val res = true
        var acc = k
        nums.forEach { it ->
            if (it == 0) {
                acc ++
            } else {
                if (acc < k) {
                    return false
                }

                acc = 0
            }
            println(acc)
        }

        return res
    }
}