// Time Complexity : O(NlogN)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            // If nums[i] == nums[i-1] then we have to skip the element 
            // to avoid duplicate triplets
            if (i > 0 && i < n && nums[i] == nums[i - 1]) {
                continue;
            }
            
            //a + b + c = 0;
            // b+c = -(a)
            //Consider the current element as "a". Find b and c in the remaining array.
            int a = nums[i];
            // If a is postive then b and c will also be postive as the array is sorted.
            // Hence there is no point in continuing the search as a+b+c will never be 0.
            if (a > 0)
                break;

            int left = i + 1;
            int right = n - 1;
            while (left < right) {
                int b = nums[left];
                int c = nums[right];
                int sum = -(a);
                if (b + c == sum) {
                    res.add(Arrays.asList(a, b, c));
                    while (left < right && nums[left] == b) {
                        left++;
                    }
                    while (left < right && nums[right] == c) {
                        right--;
                    }
                } else if (b + c < sum) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return res;
    }
}