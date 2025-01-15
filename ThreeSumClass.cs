public class Solution
{
    public IList<IList<int>> ThreeSum(int[] nums)
    {
        IList<IList<int>> result = new List<IList<int>>();

        Array.Sort(nums);
        HashSet<List<int>> hashset = new();
        int left = 0, n = nums.Length;
        int right = n - 1;
        for (int i = 0; i < n; i++)
        {
            if (i > 0 && nums[i] == nums[i - 1])
            {
                continue;
            }
            left = i + 1;
            right = n - 1;
            while (left < right)
            {

                var sum = nums[i] + nums[left] + nums[right];
                if (sum == 0)
                {
                    List<int> list = new List<int>() { nums[i], nums[left], nums[right] };
                    list.Sort();
                    if (!hashset.Contains(list))
                    {
                        result.Add(list);
                        hashset.Add(list);
                        left++;
                        right--;
                        while (left < right && nums[left] == nums[left - 1])
                        {
                            left++;
                        }
                        while (left < right && nums[right] == nums[right + 1])
                        {
                            right--;
                        }
                    }
                }
                else if (sum > 0)
                {
                    right--;
                }
                else
                {
                    left++;
                }
            }
        }
        return result;
    }
}