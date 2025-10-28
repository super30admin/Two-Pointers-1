// Time Complexity :O(n log n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/*
 * Approach
 * 
 * We are first sorting the number
 * then we start itterating over the sorted array, we fix one number and take 2 pointer and 
 * itterate from left and right, we move the pointer until we get low< high and then and in between if we get sum = 0 we store the elements
 * when one itteration is done we move to next pair
 * 
 */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] > 0) {
                break;
            }
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum == 0) {
                    List<Integer> li = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(li);
                    low++;
                    high--;
                    while (low < high && nums[low] == nums[low - 1]) {
                        low++;
                    }
                    while (low < high && nums[high] == nums[high + 1]) {
                        high--;
                    }
                } else if (sum > 0) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return result;

    }
}