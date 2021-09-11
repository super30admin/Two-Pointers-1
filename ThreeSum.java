package TwoPointers1;
// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Your code here along with comments explaining your approach
class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            //handle outside duplicate
            if(i > 0 && nums[i-1] == nums[i])
                continue;
            if(nums[i] > 0)
                break;
            int low = i+1;
            int high = nums.length-1;
            while(low < high){
                int sum = nums[i]+nums[low]+nums[high];
                if(sum == 0){
                    List<Integer> comb = Arrays.asList(nums[i], nums[low], nums[high]);
                    ans.add(comb);
                    low++;high--;
                    //handle inside duplicate
                    while(low < high && nums[low] == nums[low-1])
                        low++;
                    while(low < high && nums[high]==nums[high+1])
                        high--;
                } else if(sum > 0){
                    high--;
                } else {
                    low++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new ThreeSum().threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }
}