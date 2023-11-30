class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var index = 0
        var countOccurence = 0
        while (index < nums.size) {
            println(index)
            if (nums[index] == `val`) {
                countOccurence += 1
            }
            index++
        }
        println("occurence")
        println(countOccurence)
        
        if (countOccurence > 0) {
            var index2 = 0
            while (index2 < nums.size) {
                println("index2")
                println(index2)
                println(nums[index2])
                if (nums[index2] == `val`) {
                    var getLastIndex = getLastIndexAndElementNotVal(nums, `val`)
                    println("getLastIndex")
                    println(getLastIndex)
                    if (getLastIndex > index2) {
                        nums[index2] = nums[getLastIndex]
                        nums[getLastIndex] = `val`
                    }
                }
                index2++
            }
        }
        
        return nums.size - countOccurence
    }
    
    
    fun getLastIndexAndElementNotVal(nums: IntArray, `val`: Int): Int {
        var index = nums.size - 1
        while (index >= 0) {
            if (nums[index] != `val`) {
                return index
            }
            
            index--
        }
        return -1
    }
}