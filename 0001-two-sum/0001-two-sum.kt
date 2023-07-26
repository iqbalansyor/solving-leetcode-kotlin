class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        var result = intArrayOf(0,0)
        nums.forEachIndexed { firstIndex, num -> 
            nums.forEachIndexed { secondIndex, secondNum -> 
                if (firstIndex < secondIndex) {
                    if ((num + secondNum) == target) {
                        result = intArrayOf(firstIndex, secondIndex)
                    }
                }
            }
        }
        return result
    }
}