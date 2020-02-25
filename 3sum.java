// Time Complexity : O(N*N+NlogN)=O(N^2)
// Space Complexity : O(1) if resultant space is not consider
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     List<List<Integer>> result = new LinkedList<>();
        
     Arrays.sort(nums);
    int low, high;
    for (int i=0; i<nums.length-2; i++)
    {
        if (i>0 && nums[i]==nums[i-1])
            continue;
        
        low=i+1;
        high=nums.length-1;
        
        while(low<high)
        {
            int sum = nums[i]+nums[low]+nums[high];
            if (sum == 0){
                result.add(Arrays.asList(nums[i], nums[low], nums[high]));
                low++;
                high--;
                
                //duplicates
                while(low<high && nums[low]==nums[low-1]) low++;
                while(low<high && nums[high]==nums[high+1]) high--;
        } else if (sum>0)
                high--;
            else
                low++;
        }
    }
        return result;
    }
}