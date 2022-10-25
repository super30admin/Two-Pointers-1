// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        int x = 0;
        Arrays.sort(nums);
        int l, r;
        int total = 0;
        while (x < n){
            l = x + 1;
            r = n - 1;
            
            while (l<r){
                total = nums[x] + nums[l] + nums[r];
                
                if (total == 0){
                    result.add(Arrays.asList(nums[x], nums[l], nums[r]));
                }
                if(total <= 0){
                    ++l;
                    while (l<r && nums[l] == nums[l-1]){
                        ++l;
                    }
                }
                else{
                    --r;
                    while (l<r && nums[r] == nums[r+1]){
                        --r;
                    }
                }
                
            }
            ++x;
            while (x<l && nums[x] == nums[x-1]){
                ++x;
            }
            
        }
        
        return result;
        
        
    }
}