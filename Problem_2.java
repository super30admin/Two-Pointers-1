/*

Problem2 (https://leetcode.com/problems/3sum/)


Time Complexity : O(n^2)
Space Complexity : O(1)
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No

*/

import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        if(nums == null || nums.length == 0){
            return new ArrayList<List<Integer>>();
        }
        
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0; i<n; i++){
            int left = i+1;
            int right = n-1;
            if(nums[i] > 0){
                break;
            }
            if(i!=0 && nums[i-1] == nums[i]){
                continue;
            }
            while(left<right){
                if(nums[i] + nums[left] + nums[right] == 0){
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while(nums[left] == nums[left-1] && left<right){
                        left++;
                    }
                    while(nums[right] == nums[right+1] && left<right){
                        right--;
                    }
                }
                else if(nums[i] + nums[left] + nums[right] < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return res;
    }
}