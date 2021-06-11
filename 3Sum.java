// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3)
            return new ArrayList<List<Integer>>();
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        // sort the array
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            int low = i+1;
            int high = nums.length-1;
            
            // Skip Duplicates for pivots
            if(i!=0 && nums[i] == nums[i-1])
                continue;
            
            // consider every element as the pivot element and then peform 2 Sum using 2 pointers approach on the remaining array
            int sum = 0 - nums[i];
            while(low < high) {
                if(sum == nums[low] + nums[high]) {
                    result.add(Arrays.asList(nums[i], nums[low], nums[high]));            
                    // Skip Duplicates
                    while (low < high && nums[low] == nums[low+1]) low++;
                    while (low < high && nums[high] == nums[high-1]) high--;
                    
                    low++; high--;
                } else if (nums[low] + nums[high] < sum) {
                    low++;
                } else { 
                    high--; 
                }
            }
        }
        
        return result;
    }
}