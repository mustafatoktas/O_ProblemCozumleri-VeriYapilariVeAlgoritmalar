public class Solution
{
    public bool ContainsDuplicate(int[] nums)
    {
        HashSet<int> mySet = new HashSet<int>();
        foreach (int i in nums)
        { 
            if(!mySet.Add(i))
            {
                return true;
            }
        }
        return false;
    }
}



class Program
{
    static void Main()
    {
        Solution s = new Solution();

        int[] nums1 = { 1, 2, 3, 4, 5, 6, 7 };
        int[] nums2 = { 1, 4, 2, 3, 5, 6, 5 };

        Console.WriteLine(s.ContainsDuplicate(nums1));
        Console.WriteLine(s.ContainsDuplicate(nums2));
    }
}
