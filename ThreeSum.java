// Time Complexity : O (n^2)
// Space Complexity : O (1)
// Did this code successfully run on Leetcode : Yes


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 1. Sort
   2. Fix one pointer first, then use 2 pointers on the remaining array
   3. Move the fixed pointer
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        // sort for easy 2pointer process
        Arrays.sort(nums);
        // if first element is positive, no triplets exist
        if(nums[0] > 0) return new ArrayList<>();
        int l = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < l - 2; i++) {
            // don't reprocess duplicates
            if(i != 0 && nums[i] == nums[i - 1]) continue;

            // if our "leftmost" value is positive in a sorted array,
            // we can't have two additional values and sum to zero
            if(nums[i] > 0) break;

            // with i fixed, set left pointer to i + 1, right pointer to end
            // and search for triplets
            int j = i + 1;
            int k = l - 1;

            // search the remaining section for a pair
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    // found a valid triplet, add to result
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    // in-/de-crement left and right pointers
                    j++; k--;
                    // don't reprocess duplicates if any
                    while(j < k && nums[j] == nums[j - 1]) j++;
                    while(j < k && nums[k] == nums[k + 1]) k--;
                } else if (sum < 0) {
                    // increment only left
                    j++;
                } else {
                    // decrement only right
                    k--;
                }
            }
        }
        return result;
    }
}