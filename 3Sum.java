// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

/* Take three pointers i for 0, j for 1 and K for 3, check if number at index j ==2 , swap it with number at index k
 * if number at index j is 0 then swap it for number at index i */
class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        // using 2 - pointers

        int n = nums.length;
        int sum = 0;
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {

            // checking fixed element duplicacy

            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int start = i + 1;
            int end = n - 1;

            while (start < end) {

                sum = nums[i] + nums[start] + nums[end];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[start], nums[end]));
                    start++;
                    end--;
                    // checking duplicacy for start and end pointers
                    while (start < end && nums[start] == nums[start - 1]) {
                        start++;
                    }

                    while (start < end && nums[end] == nums[end + 1]) {
                        end--;
                    }
                }

                else if (sum < 0) {
                    start++;
                } else {
                    end--;
                }
            }
        }
        return res;
    }
}