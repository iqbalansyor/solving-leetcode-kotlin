class Solution {
    fun mySqrt(x: Int): Int {
        
        if (x == 0) return 0
        if (x <= 3) return 1
        
        var index = 0
        
        while (index <= (x/2 + 1)) {
            var exp2: Long = index.toLong() * index.toLong()
            if (exp2 == x.toLong()) return index
            if (exp2 >= x.toLong()) return index - 1
            index++
        }
        
        return 0
        
    }
}