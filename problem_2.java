/**
 * Q: Given an array nums of n integers, are there elements a, b, c in nums such
 * that a + b + c = 0? Find all unique triplets in the array which gives the sum
 * of zero.
 * 
 * Approach : Sort the array, and iterate over the sorted array. In each itreation take 
 * two pointers left and right. Based on wheather the sum of left, right and current item is
 * greater/smaller than 0 move the left or the right pointer. If sum is equal add to result and 
 * move the right pointer towards left. 
 * 
 * Time Complexity : O(n^2) 
 * Space Complexity : O(1)
 * 
 */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {
        
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[left] + nums[right] + nums[i];
                if (sum == 0) {
                    result.add(new ArrayList<Integer>(Arrays.asList(nums[left], nums[i], nums[right])));
                    right -= 1;
                    while (nums[right] == nums[right + 1] && left < right)
                        right -= 1;
                }

                else if (sum < 0) {
                    left += 1;
                    while (nums[left] == nums[left - 1] && left < right)
                        left += 1;
                } else if (sum > 0) {
                    right -= 1;

                }

            }

        }

        return result;
    }
}