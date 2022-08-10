// Time Complexity : O(n2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// We first sort the array for operating a 2 pointer approach
// It is a 2 pointer approach where we loop on the input array and operate 2 pointer approach on the rest array

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        Arrays.sort(nums);
        
        for (int i=0;i<nums.length-2;i++) {
            int start = i+1;
            int end = nums.length -1;
            
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            
            while (start < end) {
                int sum = nums[i] + nums[start] + nums[end];
                
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;
                    
                    while (start < end && nums[start] == nums[start-1]) {
                        start++;
                    }
                
                    while(start < end && nums[end] == nums[end+1]) {
                        end--;
                    }
                } else if (sum > 0) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        
        return result;
    }
}