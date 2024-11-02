class Solution {

    fun singleNumber(nums: IntArray): Int {
        var result = 0
        for (i in nums) {
            result = result xor i
        }
        return result
    }
}


fun main() {
    val nums1 = intArrayOf(2,2,1)
    val nums2 = intArrayOf(4,1,2,1,2)
    val nums3 = intArrayOf(1)
    println(Solution().singleNumber(nums1).toString())
    println(Solution().singleNumber(nums2).toString())
    println(Solution().singleNumber(nums3).toString())
}