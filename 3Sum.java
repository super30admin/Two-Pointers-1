// Time Complexity :    O(n^2) since while loop runs n times for n-2 for loop iterations
// Space Complexity :O(1) since we are doing it in constant space
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach

// we use three ptrs left curr and right where left is at first curr is at right index and right is at last
// we either do right-- if sum>0 and left ++ until the remaining array finishes
// if not found do left ++ and start again

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        if (nums == null || nums.length == 0)
            return new ArrayList<>();

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        // for i = 0 to third last element
        for (int i = 0; i < nums.length - 2; i++) {

            // to handle duplicate cases... whatever is the triplet for i-1 will be the same
            // as i so skip iteration
            if (i != 0 && nums[i] == nums[i - 1])
                continue;

            // set ptrs i at 0 j at i+1 and k at the end of array
            int j = i + 1;
            int k = nums.length - 1;

            // while the j ptr doesnt cross k and j cant be equal to k as triplet should be
            // distinct
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum == 0) {
                    // add the triplet
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    while (j < k && nums[j] == nums[j - 1])
                        j++;
                    k--;
                    while (j < k && nums[k] == nums[k + 1])
                        k--;
                } else if (sum < 0) {
                    j++;
                    while (j < k && nums[j] == nums[j - 1])
                        j++;
                } else {
                    k--;
                    while (j < k && nums[k] == nums[k + 1])
                        k--;
                }
            }

        }
        return res;
    }
}