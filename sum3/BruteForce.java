package sum3;

import java.util.*;

// Time Complexity : O(n^3)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : No
// Any problem you faced while coding this : No


public class BruteForce {

    public static void main(String[] args) {

//        int[] nums = {-1,0,1,2,-1,-4};
//        int[] nums = {0,1,1};
        int[] nums = {0,0,0};
        System.out.println(threeSum(nums));
    }

    public static List<List<Integer>> threeSum(int[] nums) {

        if (nums == null || nums.length == 0) {
            return new ArrayList<>();
        }

        HashSet<List<Integer>> set = new HashSet<>();

        int n = nums.length;

        if (n < 3) {
            return new ArrayList();
        }

        for (int i = 0; i < n - 2; i++) {

            for (int j = i + 1; j < n - 1; j++) {

                for (int k = j + 1; k < n; k++) {
                    int sum = nums[i] + nums[j] + nums[k];

                    if (sum == 0) {
                        List<Integer> myList = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(myList);
                        set.add(myList);
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }
}
