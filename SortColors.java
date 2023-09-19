// TC O(N)
// SC O(1)

import java.util.Arrays;

public class SortColors {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while (mid <= right) {
            if (nums[mid] == 2) {
                swap(nums, mid, right);
                right--;
            } else if (nums[mid] == 0) {
                swap(nums, mid, left);
                left++;
                mid++;
            } else {
                mid++;
            }
        }
    }

    private void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    public static void main(String[] args) {
        SortColors solution = new SortColors();
        
        int[] colors = {2, 0, 1, 1, 0, 2};
        System.out.println("Original Array: " + Arrays.toString(colors));
        
        solution.sortColors(colors);
        
        System.out.println("Sorted Array: " + Arrays.toString(colors));
    }
}
