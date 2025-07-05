package Kotlin

class Solution_2824 {
    fun countPairs(nums: List<Int>, target: Int): Int {
        val tmp = nums.sorted()
        var left = 0
        var res = 0
        var right = nums.size - 1
        while (left < right) {
            if (tmp[left] + tmp[right] < target) {
                res +=  right - left
                left ++
            } else {
                right --
            }
        }

        return res
    }
}