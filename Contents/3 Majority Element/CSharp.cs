// BOYER MOORE Algoritması
// Sadece majority (n/2'den fazla olan durumlar) olduğu zaman çalışır

public class Solution
{
    public int MajorityElement(int[] nums)
    {
        int result = nums[0];
        int count = 0;

        foreach (int i in nums) { 
            if (count == 0) result = i;

            if (i == result) count++;
            else count--;
        }

        return result;
    }
}


class Program
{
    static void Main()
    {
        Solution s = new Solution();

        int[] nums1 = { 3,2,3 };
        int[] nums2 = { 2, 2, 1, 1, 1, 2, 2 };

        Console.WriteLine(s.MajorityElement(nums1));
        Console.WriteLine(s.MajorityElement(nums2));
    }
}