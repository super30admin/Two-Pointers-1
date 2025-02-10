package sum3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
If we fix the pivot value, the problem is similar to 2sum
 */

public class Hashing {

    public static void main(String[] args) {

        int[] nums = {-1,0,1,2,-1,-4};
//        int[] nums = {0,1,1};
//        int[] nums = {0,0,0};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        if (nums == null || nums.length == 0 || nums.length < 3) {
            return new ArrayList();
        }

        int n = nums.length;
        HashSet<List<Integer>> set = new HashSet();
        Arrays.sort(nums);

        for (int i = 0; i < n - 2; i++) {
            int l = i + 1;
            int r = n - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                List<Integer> list = new ArrayList();

                if (sum == 0) {
                    list.add(nums[i]);
                    list.add(nums[l]);
                    list.add(nums[r]);
                    set.add(list);
                    l++;
                    r--;
                } else if (sum < 0) {
                    l++;
                } else {
                    r--;
                }
            }

        }

        return new ArrayList<List<Integer>>(set);

    }
}