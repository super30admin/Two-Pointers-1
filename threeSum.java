/*
        We can use a 2 pointer technique here
        After sorting we can use the Two sum approach here

        TC --> O(n^2)
        SC --> O(1)
 */
import java.util.*;

class Solution {

    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {

            if (nums[i] >= 1) {
                break;
            }

            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }//if

            int target = nums[i] * -1;

            int l = i + 1;
            int r = n - 1;

            while (l < r) {
                int sum_val = nums[i] + nums[l] + nums[r];
                if (sum_val == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;

                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }//while

                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;
                    }//while
                }//if
                else if (sum_val < 0) {
                    l++;
                } else {
                    r--;
                }

            }//while

        }//for

        return res;

    }
}
