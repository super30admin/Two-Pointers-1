import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;

        for (int i = 0; i < n - 2; ++i) {
            
            // if the first number is same as prev, then we have found all the
            // combinations starting with the first element. So we can skip until
            // we find the different first number
            while (i > 0 && i < n - 2 && nums[i - 1] == nums[i]) {
                i++;
            }

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                
                int sum = nums[i] + nums[left] + nums[right];
            
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    // Keep skipping until we find the different second number
                    while (left < right && nums[left - 1] == nums[left]) {
                        left++;
                    }
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }

        }
        return result;
    }
}