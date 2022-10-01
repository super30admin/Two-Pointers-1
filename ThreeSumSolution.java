// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// I will sort the array, after sorting this is very similar to 2-pointer approach
public class ThreeSumSolution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i < n; i += 1) {
            if(i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if(nums[i] > 0) {
                break;
            }
            int left = i + 1;
            int right = n - 1;
            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0) {
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    result.add(list);
                    left += 1;
                    right -= 1;
                    while(left < right && nums[left] == nums[left - 1]) {
                        left += 1;
                    }
                    while(left < right && nums[right] == nums[right + 1]) {
                        right -= 1;
                    }
                } else if(sum < 0) {
                    left += 1;
                } else {
                    right -= 1;
                }
            }
        }
        
        return result;
    }
}
