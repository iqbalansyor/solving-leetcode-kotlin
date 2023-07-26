class Solution {
    fun romanToInt(s: String): Int {
        var hashMapNew: HashMap<String, Int> = hashMapOf<String, Int>(
            "I" to 1,
            "V" to 5,
            "X" to 10,
            "L" to 50,
            "C" to 100,
            "D" to 500,
            "M" to 1000
        )
        
        var stringCharArray = s.toCharArray()
        var index = 0
        var result: Int = 0
        while (index <= stringCharArray.lastIndex) {
                var currentChar = getElementOf(stringCharArray, index)
                var nextChar = getElementOf(stringCharArray, index + 1)
                var prevChar = getElementOf(stringCharArray, index - 1)
                
                if (!isLower(prevChar, currentChar) || index == 0) {
                    
                    if (isGreater(currentChar, nextChar) || (currentChar == nextChar)) {
                        result += hashMapNew[currentChar.toString()] ?: 0
                    }

                    if (isLower(currentChar, nextChar)) {
                        result = result + ((hashMapNew[nextChar.toString()] ?: 0)- (hashMapNew[currentChar.toString()] ?: 0))
                    }
                }
                
                index = index + 1
        }
        return result
    }
    
    fun isLower(prev: Char, next: Char): Boolean {
        if (prev.toString() == "") { return false }
        var stringInteger = listOf("I", "V", "X", "L", "C", "D", "M")
        println(prev)
        println(next)
        return stringInteger.indexOf(prev.toString()) < stringInteger.indexOf(next.toString())
    }
    
    fun isGreater(prev: Char, next: Char): Boolean {
        if (next.toString() == "") { return true }
        var stringInteger = listOf("I", "V", "X", "L", "C", "D", "M")
        println("is greater")
        println(prev)
        println(next)
        println(stringInteger.indexOf(prev.toString()))
        println(stringInteger.indexOf(next.toString()))
        return stringInteger.indexOf(prev.toString()) > stringInteger.indexOf(next.toString())
    }
    
    fun getElementOf(charArray: CharArray, index: Int): Char {
        if (index < 0 || index > charArray.lastIndex) {
            return " "[0]
        } else {
            return charArray[index]
        }
    }
}
