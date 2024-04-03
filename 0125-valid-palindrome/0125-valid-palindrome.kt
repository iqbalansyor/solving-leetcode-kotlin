class Solution {
    fun isPalindrome(s: String): Boolean {
        val re = Regex("[^A-Za-z0-9 ]")
        val s2 = s.replace(re, "").replace(" ", "").toLowerCase()
        println(s2)
        
        var index = 0
        var lastIndex = s2.length - 1
        
        while (index< lastIndex) {
            
            if (s2.get(index) != s2.get(lastIndex)) {
                return false
            }
            
            index++
            lastIndex--
        }
        
        return true
    }
}