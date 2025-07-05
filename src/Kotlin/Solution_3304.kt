package Kotlin

class Solution_3304 {
    fun KthCharacter(k: Int): Char {
        return ('a' + k.countOneBits())
    }
}