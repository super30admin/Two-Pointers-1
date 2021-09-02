// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        if(nums == null || nums.length == 0)
            return triplets;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if((i == 0) || (i > 0 && nums[i] != nums[i - 1])) {
                int left = i + 1;
                int right = nums.length - 1;
                while(left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if(sum == 0) {
                        triplets.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while(left < right && nums[left] == nums[left + 1])
                            left++;
                        while(left < right && nums[right] == nums[right - 1])
                            right--;
                        left++;
                        right--;
                    } else if(sum < 0)
                        left++;
                    else
                        right--;
                }
            }
        }
        return triplets;
    }
}