class Solution {
    fun strStr(haystack: String, needle: String): Int {
        
        if (haystack.length < needle.length) { return -1 }
        
        var firstIndexList = mutableListOf<Int>()
        var index = 0
        while (index < haystack.length) {
            if (needle.get(0).toString() == haystack.get(index).toString()) {
                firstIndexList.add(index)
            }
            index++
        }
        
        if (firstIndexList.size == 0) {return -1}
        
        var index2 = 0
        while (index2 < firstIndexList.size) {
            var index3 = 0
            var firstIndex = firstIndexList[index2]
            while (index3 < needle.length) {
                var indexInHaystack = firstIndex + index3
                if (indexInHaystack < haystack.length) {
                    if (haystack.get(indexInHaystack).toString() != needle.get(index3).toString()) {
                        break
                    }
                } else { break }
                
                if (index3 == needle.length - 1) { return firstIndex }
                
                index3++
            }
            
            index2++
        }
        
        return -1
        
    }
}


// CHECK INDEX HURUF PERTAMA
// Simpan dalam array
// lalu loop berdasarkan itu, liat nextnya 