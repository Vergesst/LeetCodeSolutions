package Kotlin

import org.jetbrains.annotations.TestOnly

class Solution_1061 {
    fun smallestEquivalentString(s1: String, s2: String, baseStr: String): String {
        val fa = (0 until 26).toIntArray()

        s1.zip(s2)
            .forEach {
                (ch1, ch2) ->
                    merge(fa, ch1 - 'a', ch2 - 'a')
            }

        // convert baseStr into charArray
        val s = baseStr
            .toCharArray()
            .map {
                ch ->
                    (find(fa, ch - 'a') + 'a'.code).toChar()
            }

        return String(s.toCharArray())
    }

    fun find(arr: IntArray, x: Int): Int {
        if(arr[x] != x) {
            arr[x] = find(arr, arr[x])
        }
        return arr[x]
    }

//    fun merge(a: IntArray, b: Int, c: Int) {
//        val fx = find(a, b)
//        val fy = find(a, c)
//
//        a[fx] = minOf(fx, fy)
//    }
    fun merge(a: IntArray, b: Int, c: Int) {
        var rootB = find(a, b) // Find the root of character b
        var rootC = find(a, c) // Find the root of character c

        if (rootB != rootC) { // Only merge if they are not already in the same set
            // Make the larger root point to the smaller root
            if (rootB < rootC) {
                a[rootC] = rootB // Root of c's set now points to root of b's set
            } else {
            a[rootB] = rootC // Root of b's set now points to root of c's set
            }
        }
    }
}

private fun IntRange.toIntArray(): IntArray {
    return IntArray(this.count()) { first + it }
}

@TestOnly
fun main() {
    val solut = Solution_1061()

    val s1 = readLine()!!
    val s2 = readLine()!!
    val s3 = readLine()!!
    // expected: makkek
    println(solut.smallestEquivalentString(s1, s2, s3))
}

