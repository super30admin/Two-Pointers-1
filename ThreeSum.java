// Time Complexity : O(N * NlogN)
// Space Complexity: O(N)
// Runs on LeetCode: YES

import java.util.*;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        int i = 0;
        HashSet<ArrayList<Integer>> set = new HashSet<ArrayList<Integer>>();

        while (i < nums.length - 1) {
            int target = nums[i] * -1;
            int low = i + 1;
            int high = nums.length - 1;

            while (low < high) {
                int sum = nums[low] + nums[high];
                if (sum == target) {
                    ArrayList<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[low]);
                    triplet.add(nums[high]);
                    Collections.sort(triplet);
                    set.add(triplet);
                }
                if (low < high && sum < target) {
                    low++;
                } else {
                    high--;
                }
            }
            i++;
        }
        return new ArrayList(set);
    }
}