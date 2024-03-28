// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class SortColors {
    public void sortColors(int[] nums) {
        // Arrays.sort(nums);

        int i = 0;
        int j = nums.length - 1;
        int k = 0;
        while (i <= j) {
            if (nums[i] == 2) {
                swap(nums, i , j);
                j--;
            } else if (nums[i] == 0) {
                swap(nums, i , k);
                i++;
                k++;
            } else i++;
        }
    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
