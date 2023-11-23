// Time Complexity :O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Your code here along with comments explaining your approach
//## Problem2 (https://leetcode.com/problems/3sum/)
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
    // sorting and two pointers
        List<List<Integer>> result = new ArrayList<>();
        int target = 0;
            Arrays.sort(nums);
        int n = nums.length;
            for(int i = 0; i < n; i++){
            int low = i+1;
            int high = n - 1;
            if(i != 0 && nums[i] == nums[i-1]) continue; // this is to avoid duplicates
            while(low < high){ // follow two sum approach
                int sum = nums[i] + nums[low] + nums[high]; // for each i iterating over entire array
                if(sum == 0){
                    result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;
                    high--;
                    while(low < n && nums[low] == nums[low-1]) low++; // to eliminate duplicates
                    while(high > 0 && nums[high] == nums[high+1]) high--;
                }else if (sum > target){
                    high--;
                }else{
                    low++;
                }
            }
        }
            return result;
    }
}
