// Time Complexity : O(n log n) + n * O(n) = o(n*2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Problem2 {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        // HashSet<List<Integer>> resultSet = new HashSet<List<Integer>>();
        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length - 2; i++) {
        //     int sum = 0 - nums[i];
        //     HashSet<Integer> set = new HashSet<Integer>();
        //     for (int j = i + 1; j < nums.length; j++) {
        //         int x = sum - nums[j];
        //         if (set.contains(x)) {
        //             List<Integer> triplet = Arrays.asList(nums[i], nums[j], x);
        //             resultSet.add(triplet);
        //         } else {
        //             set.add(nums[j]);
        //         }
        //     }
        // }
        // result.addAll(resultSet);
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) { // Skip duplicates for value i
                int j = i + 1;
                int k = nums.length - 1;
                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum == 0) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                        while (j < k && nums[j] == nums[j + 1]) {
                            j++; // Skip duplicates for value j
                        }
                        while (j < k && nums[k] == nums[k - 1]) {
                            k--; // Skip duplicates for value k
                        }
                    }
                    k--;
                    j++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum(nums);

        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}
