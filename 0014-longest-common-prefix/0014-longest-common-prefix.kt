class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.size == 0) { return ""}
        if (strs.size == 1) { return strs[0]}
        
        var longest = 0
        var longestStr = ""
        strs.forEach { str ->
            if (str.length > longest) {
                longest = str.length
                longestStr = str
            }
        }
        
        var index = 0
        
        while (index < longest) {
            var slice = longestStr.substring(0, longest - index)
            var isAllContain = true
            strs.forEach { str ->
                println("is here")
                println(str.length)
                println(str)
                println(longest - 1 - index)
                if (str.length > longest - 1 - index) {
                    println("is here 2")
                    println(str.length)
                    println(longest - 1 - index)
                    var sliceStr = str.substring(0, longest - index)
                    println(slice)
                    println(sliceStr)
                    if (slice != sliceStr) {
                        println("is false")
                        isAllContain = false
                        return@forEach
                    } 
                } else {
                    println("is lower")
                    isAllContain = false
                    return@forEach
                }
            }
            
            if (isAllContain) {
                println(isAllContain)
                return slice
            } else {
                index++
            }
        }
        
        return ""
        
    }
}