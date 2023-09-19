// Time Complexity : O(nxn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes https://leetcode.com/problems/3sum/submissions/1053368963/
// Any problem you faced while coding this : Maintaining the pointers


// Your code here along with comments explaining your approach
/*
 * Sort the array, Traverse the array with i, left and right pointers
 * Calculate the sum from i, left and right and add it to the result
 * Check if there exists continuous same values from left or right, if exists increment/decrement the left/right
 */
import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length < 3)
            return new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<n; i++){
            if(i!=0 && nums[i]==nums[i-1])
                continue;
            if(nums[i]>0)
                break;
            int left = i+1;
            int right  = nums.length-1;
            while(left < right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum==0){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(left < right && nums[left]== nums[left-1]){
                        left++;
                    }
                    while(left< right && (nums[right] == nums[right+1])){
                        right--;
                    }
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return result;
    }
}