class Solution {
    fun maxFrequencyElements(nums: IntArray): Int {
        var hashNum = hashMapOf<Int, Int>()
        var index = 0
        while (index < nums.size) {
            var num = nums[index]
            if (hashNum.containsKey(num)) {
                var value = hashNum.get(num)
                hashNum.set(num, (value ?: 0) + 1)
            } else {
                hashNum.set(num, 1)
            }
            index++
        }
        
        var maxFreq = 0
        for (key in hashNum.keys) {
            var value = hashNum.get(key)
            if ((value ?: 0) > maxFreq) {
                maxFreq = value ?: 0
            }
        }
        
        val keys = hashNum.filterValues { it == maxFreq }.keys
        return keys.size * maxFreq
    }
}