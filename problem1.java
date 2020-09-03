//Time complexity O(N)
//Time complexity O(1)

class Solution {
    public static void swap(int[] nums, int i, int j) {
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }

    public void sortColors(int[] nums) {

        int l = 0;
        int curr = 0;
        int r = nums.length - 1;

        while (curr <= r) {

            if (nums[curr] == 0) {
                swap(nums, curr, l);
                curr++;
                l++;
            } else if (nums[curr] == 1) {
                curr++;
            } else {
                swap(nums, curr, r);
                r--;
            }

        }
    }
}