class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        
        // exceed limit time
//         if (s.length != t.length) return false
        
//         var s1 = s
//         var s2 = t
        
//         var index = 0
//         while (index < s1.length) {
//             var char = s1.get(index)
//             println("char")
//             println(char)
//             var index2 = 0
//             while (index2 < s2.length) {
//                 var char2 = s2.get(index2)
//                 println("char2")
//                 println(char2)
//                 if (char == char2) {
//                     println("here")
//                     var sb = StringBuilder(s2)
//                     sb.setCharAt(index2, " ".single())
//                     s2 = sb.toString()
//                     println(s2)
//                     println("\n")
//                     break
//                 }
//                 println("\n")
                
//                 index2++
//             }
//             index++
//         }
        
//         val replaceStr = s2.replace(" ", "")
//         println(replaceStr)
//         return replaceStr.length == 0
        
        val map1 = hashMapOf<Char, Int>()
        s.forEach {
            map1.put(it, map1.getOrDefault(it, 0) + 1)
        }
        val map2 = hashMapOf<Char, Int>()
        t.forEach {
            map2.put(it, map2.getOrDefault(it, 0) + 1)
        }
        return map1 == map2
        
    }
}