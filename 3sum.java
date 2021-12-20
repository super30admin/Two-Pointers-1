// Time Complexity : O(n2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach

// Used the pointers approach
// first put a loop on the array till n-2
// in the loop took the low and high pointers
// computed the sum of nums of i, low and high
// made operations using the sum 

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length == 0)
            return new ArrayList<>();
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            if (nums[i] > 0)
                break;
            int low = i + 1;
            int high = n - 1;
            while (low < high) {

                int sum = nums[i] + nums[low] + nums[high];

                if (sum == 0) {
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[low]);
                    l.add(nums[high]);
                    result.add(l);
                    low++;
                    high--;
                    while (low < high && nums[low] == nums[low - 1])
                        low++;
                    while (low < high && nums[high] == nums[high + 1])
                        high--;
                } else if (sum > 0)
                    high--;
                else
                    low++;
            }

        }
        return result;
    }
}