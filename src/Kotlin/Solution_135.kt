package Kotlin

class Solution_135 {
    fun candy(ratings: IntArray): Int {
        var ret = 1
        var pre = 1
        var dec = 0
        var inc = 1
        val len = ratings.size

        for (i in 1 until len) {
            if (ratings[i] >= ratings[i - 1]) {
                dec = 0;
                pre = if(ratings[i] == ratings[i - 1])  1 else pre + 1;
                ret += pre;
                inc = pre;
            } else {
                dec++;
                if (dec == inc) {
                    dec++;
                }
                ret += dec;
                pre = 1;
            }
        }

        return ret
    }
}