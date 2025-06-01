class Solution {

    fun containsDuplicate(nums: IntArray): Boolean {
        val mySet = mutableSetOf<Int>()
        for(i in nums) {
            if (!mySet.add(i)) {
                return true
            }
        }
        return false
    }

}


fun main() {
    val nums1 = intArrayOf(1,2,3,4,5,6,7)
    val nums2 = intArrayOf(1,4,2,3,5,6,5)
    println(Solution().containsDuplicate(nums1))
    println(Solution().containsDuplicate(nums2))
}