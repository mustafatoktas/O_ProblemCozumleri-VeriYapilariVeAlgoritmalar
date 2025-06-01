// BOYER MOORE Algoritması
// Sadece majority (n/2'den fazla olan durumlar) olduğu zaman çalışır

class Solution {

    fun majorityElement(nums: IntArray): Int {
        var result = nums[0]
        var count = 0

        for (i in nums) {
            if(count == 0) result = i

            count += if(i == result) 1 else -1
        }

        return result
    }
}


fun main() {
    val nums1 = intArrayOf(3,2,3)
    val nums2 = intArrayOf(2,2,1,1,1,2,2)
    println(Solution().majorityElement(nums1).toString())
    println(Solution().majorityElement(nums2).toString())
}