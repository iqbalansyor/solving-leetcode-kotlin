class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        var numString = x.toString()
        println(numString)
        
        var numCharArray = numString.toCharArray()
        
        var front = 0
        var back = numCharArray.lastIndex
        while (front < back) {
            println(front)
            println(back)
            if (numCharArray[front] != numCharArray[back]) {
                return false
            }
            front = front + 1
            back = back - 1
        }
        
        return true
    }
}