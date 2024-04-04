class Solution {
    fun addDigits(num: Int): Int {
        
        var x = num
        while (x > 9) {
            var yNum = 0
            var y = x
            while (y >= 1) {
                var mod = y % 10
                yNum += mod
                y /= 10
            }
            x = yNum
        }
        
        return x
        
    }
}