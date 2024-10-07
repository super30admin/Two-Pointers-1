
// Time Complexity : 0(n log n)
// Space Complexity : 0(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        Arrays.sort(nums);
        for(int i = 0; i<nums.length-2; i++)
        {
            int low = i+1;
            int high = nums.length-1;
            while(low<high)
            {
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0)
                {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                }
                if(low<high && nums[low]==nums[low-1])
                {
                    low++;
                }
                else
                {
                    high--;
                }

            }
            
        }
        return result;
    }
}