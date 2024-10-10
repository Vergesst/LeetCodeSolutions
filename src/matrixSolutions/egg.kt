package matrixSolutions

fun distributeEgg(eggs: Int, baskets: Int): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    val path = mutableListOf<Int>()

    fun backtrack(eggs: Int, baskets: Int) {
        fun bigger (a: Int, b: List<Int>): Boolean {
            for(x in b) {
                if (a > x) {
                    return false
                }
            }
            return true
        }
        if (baskets == 0) {
            if (eggs == 0) {
                result.add(path.toList())
            }
            return
        }
        val end = eggs / baskets
        for(i in eggs downTo end) {
            if(bigger(i, path)) {
                path.add(i)
                backtrack(eggs - i, baskets - 1)
                path.removeAt(path.size - 1)
            }
        }
    }

    backtrack(eggs, baskets)
    return result
}

fun main() {
    val eggs = readln().toInt()
    val baskets = readln().toInt()
    val result = distributeEgg(eggs, baskets)
    for (r in result) {
        println(r.toString())
    }
}