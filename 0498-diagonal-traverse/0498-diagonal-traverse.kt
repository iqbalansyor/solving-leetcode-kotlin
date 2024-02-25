class Solution {
    fun findDiagonalOrder(mat: Array<IntArray>): IntArray {
        
        var newMat = mutableListOf<MutableList<Int>>()
        
        var count = mat.size
        var index = 0
        var countFirstItem = 0
        
        if (count == 1) {
            return mat[0]
        }
        
        
        if (count > 0) {
            countFirstItem = mat.get(0).size
            if (countFirstItem > count) {
                count = countFirstItem
            }
        }
        

        while (index < 2*count) {
            println("here 1")
            println(index)
            println("done 1")
            
            var index2 = 0
            var itemMat = mutableListOf<Int>()
            
            while (index2 < 2*countFirstItem) {
                val y = index2
                val x = index - index2
                println("here 2")
                println(x)
                println(y)
                if (x < mat.size && x >= 0) {
                    val arr = mat.get(x)
                    
                    if (y < arr.size && y >= 0) {
                        itemMat.add(arr.get(y))
                        println(arr.get(y))
                    }
                }
                

                println("done 2 \n")
                index2++
            }
            if (itemMat.size > 0) {
                newMat.add(itemMat)
            }
            index++
        }
        
        index = 0
        var newMutableList = mutableListOf<Int>()
        while (index < newMat.size) {
            if (index % 2 != 0) {
                val arr = newMat.get(index)
                var index2 = 0
                while (index2 < arr.size) {
                    newMutableList.add(arr[arr.size - index2 - 1])
                    index2++
                }
            } else {
                val arr = newMat.get(index)
                var index2 = 0
                while (index2 < arr.size) {
                    newMutableList.add(arr[index2])
                    index2++
                }
            }
            index++
        }
        
        return newMutableList.toIntArray()
    }
}

// 00
// 10
// 01
// 20
// 11
// 02
// 21
// 12
// 22

