class Solution {
    fun isValid(s: String): Boolean {
        
        var stackList: MutableList<String> = mutableListOf<String>()
        
        var index = s.length - 1
        
        while (index < s.length && index >= 0) {
            
            if (s.get(index).toString() == "}" || s.get(index).toString() == "]" ||  s.get(index).toString() == ")") {
                stackList.add(s.get(index).toString())
                println("add")
                println(s.get(index).toString())
            } 
            
            if (s.get(index).toString() == "{" || s.get(index).toString() == "[" ||  s.get(index).toString() == "(") {
                if (stackList.size > 0) {
                    var lastElement = stackList.last()
                    stackList.removeAt(stackList.size - 1)
                    
                    println("pop")
                    println(lastElement)
                    
                    if (s.get(index).toString() == "{") {
                        if (lastElement != "}") { 
                            return false }
                    }
                    
                    if (s.get(index).toString() == "[") {
                        if (lastElement != "]") { 
                            return false }
                    }
                    
                    if (s.get(index).toString() == "(") {
                        if (lastElement != ")") { 
                            return false }
                    }
                } else {
                    return false
                }
            } 
            index--
        }
        
        return stackList.size == 0
    }
}