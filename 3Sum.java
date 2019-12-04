Time Complexity-O(n)
Space Complexity-O(1)
class Solution {
        public void sortColors(int[] nums) {
        int l = 0, r = nums.length - 1, i = 0;
        while (i <= r) {
            if (nums[i] == 0) {
                nums[i] = nums[l];
                nums[l] = 0;
                l++;
            }
            else if (nums[i] == 2) {
                nums[i] = nums[r];
                nums[r] = 2;
                r--;
                i--;
            }
            i++;
        }
    }
}
