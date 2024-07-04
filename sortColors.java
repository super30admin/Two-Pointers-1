/*
TC --> O(n)
SC --> O(1)
 */
class Solution {

    public void sortColors(int[] nums) {
        int n = nums.length;
        int l = 0;
        int r = n - 1;
        int idx = 0;

        while (idx <= r) {
            if (nums[idx] == 0) {
                swap(nums, l++, idx++);

            } else if (nums[idx] == 2) {
                swap(nums, idx, r--);

            } else {
                idx++;
            }
        }

    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
