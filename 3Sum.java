// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No 


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length-2;i++)
        {   
            if(i-1>=0 && nums[i]==nums[i-1])
            {
                continue;
            }
            int left=i+1;
            int right = nums.length-1;
            while(left<right)
            {
                if(nums[i]+nums[left]+nums[right]==0)
                {
                   List<Integer> temp = new ArrayList<>();
                   temp.add(nums[i]);
                   temp.add(nums[left]);
                   temp.add(nums[right]);
                   output.add(temp);
                    while(left+1<nums.length && nums[left]==nums[left+1]) left++;
                    while(right-1>=0 && nums[right]==nums[right-1])right--;
                    left++;
                    right--;
            
                }else if(nums[i]+nums[left]+nums[right]<0)
                {
                    left++;
                }else{
                    right--;
                }
                
                
            }
        }
        
        return output;
        
    }
}