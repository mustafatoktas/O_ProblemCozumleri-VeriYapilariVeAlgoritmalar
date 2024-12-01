class Solution {
    fun findDuplicate(nums: IntArray): Int {
        for (i in nums.indices) {
            for (j in nums.indices) {
                if (i == j) continue
                if (nums[i] == nums[j]){
                    return nums[i]
                }
            }
        }
        return 0
    }
}

fun main() {
    val nums1 = intArrayOf(1,3,4,2,2)
    val nums2 = intArrayOf(3,1,3,4,2)
    val nums3 = intArrayOf(3,3,3,3,3)

    println(Solution().findDuplicate(nums1))
    println(Solution().findDuplicate(nums2))
    println(Solution().findDuplicate(nums3))
}