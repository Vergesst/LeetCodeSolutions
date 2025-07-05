package Kotlin

import com.sun.security.jgss.InquireType
import java.util.PriorityQueue

class Solution_2099 {
    fun maxSubsequence(nums: IntArray, k: Int): IntArray {
        // first => value
        val minHeap = PriorityQueue<Pair<Int, Int>> (k, compareBy { it.first })

        nums.forEachIndexed{ index, value ->
            if (minHeap.size < k) {
                minHeap.add(Pair(value, index))
            } else {
                if (value > minHeap.peek().first) {
                    minHeap.poll()
                    minHeap.add(Pair(value, index))
                }
            }
        }

        return minHeap
            .toList()
            .sortedBy { it.second }
            .map { it.first }
            .toIntArray()
    }
}