// Time Complexity = O(n^2)
// Space Complexity = O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length == 0) return new ArrayList<>();

        List<List<Integer>> ret = new ArrayList<>();

        // Sort the array so that we can apply 2 pointer approach
        Arrays.sort(nums); // O(n logn)
        int n = nums.length;
        for (int i=0; i<n-2; i++) {
            // If value of i is same as previous i, we continue
            if ((i>0) && nums[i] == nums[i-1]) {
                continue;
            }

            // Since the array is in ascending order, if we encounter an i which is greater than 0, the low and high will be positive as well, which means the result addition can never be 0, so just break the loop.
            if (nums[i] > 0) {
                break;
            }

            // Take a 2 pointer approach where low starts from i+1 and high from last element n-1
            int low=i+1, high=n-1;
            while (low<high) {
                int sum = nums[i] + nums[low] + nums[high];

                // Based on the sum value we have 3 conditions, we increment low or decrement high
                if (sum == 0) {
                    ret.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;

                    // Check for repeated elements and skip them
                    while (low<high && nums[low] == nums[low-1]) low++;
                    while (low<high && nums[high] == nums[high+1]) high--;
                }
                else if (sum > 0) {
                    high--;
                }
                else {
                    low++;
                }
            }
        }
        return ret;
    }
}