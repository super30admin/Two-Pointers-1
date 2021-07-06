// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);        
        List<List<Integer>> output_arr = new LinkedList<>();
        //edge
        if(nums == null || nums.length < 3) return output_arr;
        
        for(int i = 0; i < nums.length-2; i++){ //to check for next 2 elements and to avoid out of bound
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])){ //if duplicate, skip
                int low = i+1;
                int high = nums.length-1;
                int target = 0-nums[i]; //check if two nos. add up to zero
                
                while(low < high){
                    if(nums[low] + nums[high] == target){
                        output_arr.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        while(low < high && nums[low] == nums[low+1]) low++; //skip duplicates
                        while(low < high && nums[high] == nums[high-1]) high--;  
                        low++;
                        high++;
                    } else if(nums[low] + nums[high] < target){
                        low++;
                    }else{
                        high--;
                    }
                }
            }
        }
        return output_arr;
    }
}