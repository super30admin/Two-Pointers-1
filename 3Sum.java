import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Approach: Sort + two pointer
// Time: NlogN + N^2 ~= O(N^2) // Considering higher order term
// Space: O(1)
/**
 * Sort the Array. Iterate through the array by fixing the first element
 * and performing two pointer on the remaining elements to find the remaining 2 elements.
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i ++) {
            if (i > 0 && nums[i] == nums[i - 1]){
                // avoid duplicacy at the first element since the solutions were already found at i - 1 index
                continue;
            }
            if (nums[i] > 0) {
                // There will be no triplet whose sum will be 0 from i index since we sorted the array.
                break;
            }
            // Two pointer
            int p1 = i + 1;
            int p2 = nums.length - 1;
            while (p1 < nums.length && p1 < p2) {
                int sum = nums[i] + nums[p1] + nums[p2];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[p1], nums[p2]));
                    // move to next indices
                    p1 ++;
                    p2 --;
                    while (p1 < p2 && nums[p1] == nums[p1 - 1]) { // avoid duplicacy
                        p1 ++;
                    }
                    while (p2 > p1 && nums[p2] == nums[p2 + 1]) { // avoid duplicacy
                        p2 --;
                    }
                } else if (sum < 0) {
                    // move right towards greater numbers
                    p1 ++;
                } else {
                    // move left towards smaller numbers
                    p2 --;
                }
            }
        }
        return result;
    }
}