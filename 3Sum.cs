// time complexity - (nlogn + n^2 ) so total n^2
// space complexity - O(1)
// approach- We will be sorting the array first and then using two pointers to get the triplets
public class Solution
{
    public IList<IList<int>> ThreeSum(int[] nums)
    {
        int n = nums.Length;
        List<IList<int>> result = new List<IList<int>>();
        if (nums == null || nums.Length < 3)
        {
            return new List<IList<int>>();
        }
        Array.Sort(nums);
        for (int i = 0; i < n - 2; i++)
        {
            if (nums[i] > 0)
            {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1])
            {
                continue;
            }
            int l = i + 1;
            int r = n - 1;
            while (l < r)
            {
                int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0)
                {
                    List<int> triplet = new List<int> { nums[i], nums[l], nums[r] };
                    result.Add(triplet);
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1])
                    {
                        l++;
                    }
                    while (l < r && nums[r] == nums[r + 1])
                    {
                        r--;
                    }
                }
                else if (sum > 0)
                {
                    r--;
                }
                else
                {
                    l++;
                }
            }
        }
        return result;
    }
}