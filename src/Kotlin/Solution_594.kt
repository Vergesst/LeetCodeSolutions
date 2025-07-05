package Kotlin

class Solution_594 {
    fun findHSL(nums: IntArray): Int {
        nums.toList()
            .groupingBy { it }
            .eachCount()
            .let { cnt ->
                var max = 0
                cnt.forEach { k, v ->
                    if (cnt.contains(k + 1)) {
                        max = maxOf(max, v + cnt[k + 1]!!)
                    }
                }
                return max
            }
    }
}