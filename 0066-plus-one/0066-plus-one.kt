class Solution {
    fun plusOne(digits: IntArray): IntArray {
        
//         var x = 0
        
//         for (index in digits.indices) {
//             var exp = digits.size - index - 1
//             x += (digits[index] * (10.0f.pow(exp))).toInt()
//         }
        
//         var plusOne = x + 1
        
//         var newDigits = mutableListOf<Int>()
//         var expDiff = 10
        
//         while(plusOne > 0) {
//             println(plusOne)
//             var mod = plusOne % expDiff
//             plusOne /= expDiff
//             newDigits.add(0, mod)
//         }
        
//         return newDigits.toIntArray()
        
//         var lastItem = digits[digits.size - 1]
        
//         if (lastItem < 9) {
//             digits[digits.size - 1] = lastItem + 1
//         } else {
//             digits[digits.size - 1] = 0
            
//         }
        
        val plusOneS = plusOneForIndex(digits, 0, digits.size - 1)
        
        for (digit2 in plusOneS) {
            println(digit2)
        }
        return plusOneS
        
    }
    
    fun plusOneForIndex(digits: IntArray, startIndex: Int, endIndex: Int): IntArray {
        var endItem = digits[endIndex]
        println("startIndex")
        println(startIndex)
        println("endIndex")
        println(endIndex)
        if (endItem < 9) {
            digits[endIndex] = endItem + 1
        } else {
            digits[endIndex] = 0
            if (startIndex == endIndex) {
                println("here")
                var mutableListDigits = digits.toMutableList()
                for (digit in mutableListDigits) {
                    println(digit)
                }
                mutableListDigits.add(0, 1)
                for (digit2 in mutableListDigits) {
                    println(digit2)
                }
                return mutableListDigits.toIntArray()
            } else {
                println("here2")
                return plusOneForIndex(digits, startIndex, endIndex - 1)
            }
        }
        println("here3")
        return digits
    }
}