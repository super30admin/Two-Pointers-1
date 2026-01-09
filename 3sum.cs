public class Solution1 {
    //Approach
    //Sort the Array to use 2 pointer
    //Iterate over an array , pick one element and apply  2 pointer using left and right on rest of the array
    // skip the duplicates to avoid duplicate sum
    public IList<IList<int>> ThreeSum(int[] nums)
    {
        // Time:  O(n²)
        // Space: O(1)

        List<IList<int>> result = new();
        if (nums.Length == 0 || nums.Length < 3)
        {
            return result;
        }
        Array.Sort(nums);
        for (int i = 0; i < nums.Length; i++)
        {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            if (nums[i] > 0)
                break;
            int l = i + 1; int r = nums.Length - 1;

            while (l < r)
            {
                int sum = nums[i] + nums[l] + nums[r];

                if (sum == 0)
                {
                    result.Add(new List<int> { nums[i], nums[l], nums[r] });
                    l++; r--;
                    while (l < r && nums[l] == nums[l - 1])
                        l++;
                    while (l < r && nums[r] == nums[r + 1])
                        r--;
                }
                else if (sum < 0)
                {
                    l++;
                }
                else
                {
                    r--;
                }
            }
        }
        return result;
    }
    
}

// Using HashSet
// Time:  O(n²)
// Space: O(n)
    public class Solution2 {
    public IList<IList<int>> ThreeSum(int[] nums) 
    { 
        List<IList<int>> result = new();
        HashSet<(int,int,int)> hash = new();
        Array.Sort(nums);
        if(nums.Length == 0 || nums.Length < 3)
        {
            return new List<IList<int>>();
        }
        for(int i=0;i<nums.Length-2;i++)
        {
            int left = i+1;
            int right = nums.Length - 1;
            while(left < right)
            {
                int sum = nums[i]+nums[left]+nums[right];
                if(sum == 0)
                {
                    var triplet = (nums[i], nums[left], nums[right]);

                    if (hash.Add(triplet))  // Adds only if unique
                    {
                        result.Add(new List<int> { nums[i], nums[left], nums[right] });
                    }

                    left++;
                    right--;
                }
                else if(sum > 0)
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

