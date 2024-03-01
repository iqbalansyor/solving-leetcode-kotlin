class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
        
        if (nums2.size == 0) { return }
        
        var endIndex = m - 1
        var y = n - 1
        var len = nums1.size - 1
        
        while (y >= 0) {
            if (endIndex < 0) {
                println(endIndex)
                println(y)
                println(nums2[y])
                println("========")
                nums1[len] = nums2[y]
                len--
                y--
            }
            else if (nums2[y] >= nums1[endIndex]) {
                nums1[len] = nums2[y]
                len--
                y--
            } else {
                nums1[len] = nums1[endIndex]
                nums1[endIndex] = 0
                len--
                endIndex--
            }
        }
    }
}