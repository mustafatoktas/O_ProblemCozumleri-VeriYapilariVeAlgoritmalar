public class Solution
{
    public int SingleNumber(int[] nums)
    {
        int result = 0;
        foreach (int x in nums)
        {
            result = result ^ x;
        }
        return result;
    }
}


class Program
{
    static void Main()
    {
        Solution s = new Solution();

        int[] nums1 = { 2,2,1 };
        int[] nums2 = { 4,1,2,1,2 };
        int[] nums3 = { 1 };

        Console.WriteLine(s.SingleNumber(nums1));
        Console.WriteLine(s.SingleNumber(nums2));
        Console.WriteLine(s.SingleNumber(nums3));
    }
}
