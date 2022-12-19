import java.util.*;

// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         
        List<List<Integer>> result = new ArrayList();
        int prevLow, prevHigh;
        
        //having the numbers in sorted order, helps to find the sum logically
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length-2; i++) {
            // select one number
            int target = 0 - nums[i];
            int j = i + 1, k = nums.length - 1;
            // two sum on the rest of the array
            while (j < k) {
                int sum = nums[j] + nums[k];
                if (sum == target) { //if we find one pair, add to result
                    List<Integer> list = new ArrayList(Arrays.asList
                                                       (nums[i], nums[j++], nums[k--]));
                    result.add(list);   
                    // ignoring repeated numbers
                    while(j<k && nums[j]==nums[j-1]) j++;
                    while(j<k && nums[k]==nums[k+1]) k--;
                    
                } else if (sum < target) {
                    //if sum is less than target, we need to find greater j
                    j++;
                } else{
                    //if sum is greater than target, we need to find smaller k
                    k--;
                }
            }
        }
        return result;
    }
}
