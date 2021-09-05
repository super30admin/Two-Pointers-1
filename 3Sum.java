// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // if array is null or has less than three elements then return empty list
        if(nums == null || nums.length < 3) return new ArrayList<>();
        // initialize list to be returned
        List<List<Integer>> result = new ArrayList<>();
        // sort the array
        Arrays.sort(nums);
        // iterate through array
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1]) continue; // remove duplicacy
            // intialize low and high pointers
            int low = i + 1; int high = nums.length - 1;
            while(low < high){
                // while low and high pointers do not cross each other
                // calculate the sum of three elements
                int sum = nums[i] + nums[low] + nums[high];
                // add the triplet to list if sum = 0
                if(sum == 0){
                    List<Integer> li = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(li);
                    // increment low pointer and decrement high pointer
                    low++; high--;
                    // remove duplicacy
                    while(low < high && nums[low] == nums[low - 1]) low++;
                    while(low < high && nums[high] == nums[high + 1]) high--;
                } else if(sum > 0) high --; //if sum is greater than 0, decrement the high pointer
                else low ++; // if sum is less than 0, increment the low pointer
            }
        }
        return result;
    }
}