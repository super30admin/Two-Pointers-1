// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : coming up with logic of 2 pointer
// Approach - sort the array, iterate every element with i, and maintain left and right pointers to find elements which add up to 0. if current sum is less than 0, increment left. if greater than zero, decrement right.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        // if duplicate, continue
        for(int i=0; i<nums.length; i++) {

            if(i!=0 && nums[i-1] == nums[i]) {
                continue;
            }

            int left = i+1;
            int right = nums.length - 1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                // if sum less than 0, increment left
                if(sum < 0) {
                    left = left + 1;

                    //ignore duplicates
                    while(left < right && nums[left-1] == nums[left]) {
                        left = left + 1;
                    }
                    // if sum greater than 0, decrement right
                } else if(sum > 0) {
                    right = right - 1;

                    //ignore duplicates
                    while(left < right && nums[right+1] == nums[right]) {
                        right = right - 1;
                    }

                    //else add elements to output, increment left and decrement right
                } else {
                    result.add(new ArrayList<>(Arrays.asList(nums[i],nums[left],nums[right])));
                    left = left + 1;
                    right = right - 1;

                    //ignore duplicates
                    while(left < right && nums[left-1] == nums[left]) {
                        left = left + 1;
                    }
                    while(left < right && nums[right+1] == nums[right]) {
                        right = right - 1;
                    }
                }
            }

        }
        

        return result;
    }
}