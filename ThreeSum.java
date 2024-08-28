// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Take index i and find 2 sum for the rest of the array using two pointer
// skip repeating pairs by finding next unique elements in 2sum
// skip repeating index element also

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        List<List<Integer>> result = new ArrayList();
        int i = 0;

        while (i < n-2) {

            if(nums[i]>0) break;

            int l = i + 1;
            int r = n - 1;

            while (l < r) {
                if (nums[i] + nums[l] + nums[r] == 0) {
                    result.add(new ArrayList<>(Arrays.asList(nums[i], nums[l], nums[r])));
                    l++;
                    r--;
                    while (l<r && nums[l-1] == nums[l]) l++;
                    while (l<r && nums[r] == nums[r + 1]) r--;
                } else if (nums[i] + nums[l] + nums[r] < 0) {
                    l++;
                } else {
                    r--;
                }
            }

            i++;
            while(i<n && nums[i-1] == nums[i]) i++;
        }

        return result;
    }
}