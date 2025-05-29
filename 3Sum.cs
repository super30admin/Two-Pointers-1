/*
  Time complexity: O(n^2)
  Space complexity: O(1)

  Code ran successfully on leetcode: Yes

  Approach: For each of the numbers in nums, the 2-sum in the subarray to the right of the element is subjected to a 2 pointer approach. This results in triplets that add upto a particular sum.

*/

public class Solution {
    public IList<IList<int>> ThreeSum(int[] nums) {
        Array.Sort(nums);
        List<IList<int>> result = new();
        for(int i=0;i<nums.Length && nums[i]<=0;i++)
        {
            if(i==0 || nums[i]!=nums[i-1])
                TwoSum(nums,result,i);
        }
        return result;
    }

    private void TwoSum(int[] nums, List<IList<int>> result, int i)
    {
       int low = i+1;
       int high = nums.Length-1;
       while(low<high)
       {
        int sum = nums[i]+nums[low]+nums[high];
        if(sum==0)
        {
            List<int> temp = new();
            temp.Add(nums[i]);
            temp.Add(nums[low]);
            temp.Add(nums[high]);

            result.Add(temp);

            while(low<high && nums[low]==nums[low+1])
                low++;
            while(low<high && nums[high]==nums[high-1])
                high--;

            low++;
            high--;
        }
        else
        {
            if(sum<0)
                low++;
            else
                high--;
        }
       }
    }
}
