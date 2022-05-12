// Time Complexity :O(nlogn)+O(n^2)===O(n^2)
// Space Complexity :constant
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :No

//first we'll sort the array, then we'll iterate through each element and using two pointers at next all elements,
//we'll find triplet having sum=0 if we found the sum, to avoid duplicacy, we will ignore all same elements at left ptr and at right ptr
//if we found number>0, we'll stop iterating as we cannot find smaller number next to 0

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return result;
        }
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            if (nums[i] > 0)
                break;
            if ((i > 0 && nums[i] == nums[i - 1]))
                continue;

            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == 0) {
                    List<Integer> li = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(li);
                    left++;
                    right--;
                    while (left < right && nums[left] == nums[left - 1]) {
                        left++;
                    }
                    while (left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                } else {
                    right--;
                }

            }

        }
        return result;
    }
}