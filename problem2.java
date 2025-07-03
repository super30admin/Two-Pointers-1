// Time Complexity : O(n^2)
// Space Complexity : O(nlogn) for sorting array
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach : I sort the array and iterate over the array, fix one element idx and then use two pointers from left and right to find elements that will give me the right sum. When I find the right indices, I make sure to iterate over till there are duplicates.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int idx = 0;
        List<List<Integer>> res = new ArrayList<>();
        while(idx<nums.length-2){
            if(idx>0 && nums[idx]==nums[idx-1]){
                idx++;
                continue;
            }
            int low = idx+1;
            int high = nums.length-1;
            while(low<high){
                if(nums[low] + nums[high] + nums[idx] == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[idx]);
                    list.add(nums[low]);
                    list.add(nums[high]);
                    res.add(list);
                    low++;
                    high--;
                    while(low<high && nums[low]==nums[low-1]) low++;
                    while(high>low && nums[high]==nums[high+1]) high--;
                }
                else if(nums[low] + nums[high] + nums[idx] < 0) low ++;
                else high--;
            }
            idx++;
        }
        return res;
    }
}