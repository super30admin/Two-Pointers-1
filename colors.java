//time = o(n) space =o(1)
class Solution {
    public void swap(int[] nums, int a, int b) {
        int t = nums[a];
        nums[a] = nums[b];
        nums[b] = t;
    }

    public void sortColors(int[] nums) {
        int l = 0;
        int h = nums.length - 1;
        int m = 0;

        while (m <= h) {
            if (nums[m] == 0) {
                swap(nums, l, m);
                m++;
                l++;
            } else if (nums[m] == 2) {
                swap(nums, m, h);
                h--;
            } else {
                m++;
            }
        }
    }
}
