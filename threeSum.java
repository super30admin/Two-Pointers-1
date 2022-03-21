/*

Time Complexity : O(n^2) : we travase the array for i n times and then for while condition maximum n -1 time.

Space Complexity: O(1) : as we are not using any extra space

Leetcode : Worked on leetcode.


*/

import java.util.*;

public class threeSum {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {

            List<List<Integer>> result = new ArrayList<>();

            Arrays.sort(nums);

            // checking null case
            if (nums == null || nums.length == 0) {

                return result;
            }
            for (int i = 0; i < nums.length - 2; i++) {

                // checking if i ==0 or last number is not equal to i to remove duplicate
                // triplets.

                if (i == 0 || nums[i] != nums[i - 1]) {

                    int j = i + 1;
                    int k = nums.length - 1;

                    while (j < k) {

                        // adding the three elements
                        int sum = nums[i] + nums[j] + nums[k];

                        if (sum == 0) {

                            result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                            j++;
                            k--;

                            // checking if next element is same as previous then incrementing while the
                            // condition is true
                            while (j < k && nums[j] == nums[j - 1]) {

                                j++;
                            }

                            // checking if next element is same as previous then decrementing while the
                            // condition is true
                            while (j < k && nums[k] == nums[k + 1]) {

                                k--;
                            }

                        } else if (sum > 0) {

                            k--;

                        } else {

                            j++;
                        }
                    }
                }
            }

            return result;
        }
    }
}
