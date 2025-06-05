package Kotlin

class Solution_1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val indices = mutableMapOf<Int, Int>()

        nums.forEachIndexed {i, v ->
            indices[target - v]?.let { prevI ->
                return intArrayOf(prevI, i)
            }
            indices[v] = i
        }

        return intArrayOf()
    }
}
