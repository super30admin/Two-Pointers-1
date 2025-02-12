// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        if(nums == null || nums.length == 0){
            return res;
        }

        Arrays.sort(nums);
        int n = nums.length;

        for(int i = 0; i < n-2; i++){
            int j = i+1, k = n-1;

            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }

            int target = -1 * nums[i];
            while(j < k){
                int sum = nums[j] + nums[k];

                if(sum == target){
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while(j < k && nums[k] == nums[k+1]){
                        k--;
                    }
                    while(j < k && nums[j] == nums[j-1]){
                        j++;
                    }
                }else if(sum > target){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return res;
    }
}