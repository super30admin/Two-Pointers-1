// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

/**
 * Sorting the array and starting the outer loop to iterate over all numbers.
 * Using 2 pointers inside the outer loop with pointers at beginning at outer loop and end of the array to find matches.
 * If match is found, add it to response and move the left, right pointers to next unique element since we have to find unique pairs.
 * If match is not found, then move left,right pointers based on the sum.
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0)
                break;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int current = nums[i] + nums[left] + nums[right];
                if (current == 0) {
                    answer.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1])
                        left++;
                    while (left < right && nums[right] == nums[right + 1])
                        right--;
                } else if (current > 0)
                    right--;
                else
                    left++;
            }
        }

        return answer;
    }
}