// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/**
 * I have employed 2 pointer approach to find the triplets with sum == 0
 * As we have to find the unique triplets, I have done uniqueness check at the first iteration and while iteration in the inner loop. 
 */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        for (int i=0;i<nums.length - 2;i++) {
            int start = i+1;
            int end = nums.length - 1;
            
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            
            while(start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                
                if(sum == 0) {
                    List<Integer> temp = new ArrayList<>();
                    
                    temp.add(nums[i]);
                    temp.add(nums[start]);
                    temp.add(nums[end]);
                    result.add(temp);
                    
                    while(start < end && nums[start] == nums[start + 1]) {
                        start++;
                    }
                    start++;
                    
                    while(start < end && nums[end] == nums[end - 1]) {
                        end--;
                    }
                    end--;
                    
                } else if (sum > 0) {
                    end--;
                } else if (sum < 0) {
                    start++;
                }
            }
        }
        
        return result;
        
    }
}