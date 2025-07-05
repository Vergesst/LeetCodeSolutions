package Kotlin

import Kotlin.Solution_1394.findLucky
import java.util.TreeMap

object Solution_1394 {
    fun findLucky(nums: IntArray): Int {
        if (nums.isEmpty()) return -1 // Changed to -1 as per typical problem constraints
        // Changed to TreeMap
        val freq = nums.toTypedArray()
            .groupingBy { it }
            .eachCount()
            .let {TreeMap(it)}

        val list = mutableListOf<Int>().apply { add(-1) } // Add -1 as default if no lucky number found
        freq.forEach { (k, v) ->
            println("$k = $v")
            if (k == v)
                list.add(k)
        }

        // Return the largest lucky number, or -1 if none found
        return list.maxOrNull() ?: -1 // Use maxOrNull and provide default
    }
}

fun main() {
    findLucky(intArrayOf(4,3,2,2,4,1,3,4,3)).let(::println)
}