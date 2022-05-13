//Time Complexity: O(n^2)
//Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        //null case
        int n = nums.length;
        if(nums == null || nums.length == 0) return result;
        Arrays.sort(nums);
        for(int i = 0; i < n- 2; i++) {
            //Handling outside duplicacy
            if(i > 0 && nums[i] == nums[i-1]) continue;
            if(nums[i] > 0) break;
            int left = i + 1;
            int right = n-1;
            while(left < right) {
                int currentSum = nums[i] + nums[left] + nums[right];
                if(currentSum == 0) {
                    List<Integer> list = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(list);
                    left++;
                    right--;
                    //Handling Inside duplicacy
                    while(left < right && nums[left] == nums[left-1]) left++;
                    while(left < right && nums[right] == nums[right + 1]) right--;
                }
                else if(currentSum < 0) {
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
