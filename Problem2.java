import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach

/**
 * We have multiple approaches to solve this problem but the best solution will be
 * TC: O(n^2) and SC: O(1). We sort the array first and for a pivot, do two-sum approach
 * on the remaining array to find it's compliment. To avoid the duplicates, we check if
 * previous element is same, do low++ and high--
 */

public class Problem2 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        for(int i=0; i<nums.length; i++) {
            if((i!=0) && (nums[i] == nums[i-1])) continue;
            if(nums[i] > 0) break; //because we won't find a pair as array is sorted

            int low = i+1;
            int high = nums.length-1;
            int target = 0 - nums[i];

            while(low < high) {
                if(nums[low] + nums[high] == target) {
                    res.add(List.of(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                    while(low<high && nums[low] == nums[low-1]) low++;
                    while(low<high && nums[high] == nums[high+1]) high--;
                } else if(nums[low] + nums[high] < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }

        return res;
    }
}
