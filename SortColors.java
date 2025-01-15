import java.util.Arrays;

/**
 * Similar to - Dutch National Flag Problem
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 *
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 *
 * You must solve this problem without using the library's sort function.
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 * Ran on leetcode? yes
 * Issues faced? None
 *
 * Approach:
 * Use three pointers where:
 * left: Tracks the boundary of 0s.
 * right: Tracks the boundary of 2s.
 * mid: Traverses through the array and processes the current element.
 */
public class SortColors {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0)
            return;

        int left = 0;
        int right = nums.length - 1;
        int mid = 0;

        while (mid <= right) {
            if (nums[mid] == 2) {
                swap(nums, mid, right);
                right--;
                // here don't increment mid because we need to recheck the swapped element at mid
            } else if (nums[mid] == 0) {
                swap(nums, mid, left);
                left++;
                mid++;
            } else {
                mid++;
            }
        }
    }

    /**
     * Use the swap operation to move elements into the correct regions
     */
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        SortColors obj = new SortColors();
        int[] nums = {0,1,2,1,0,2,1,1,0};
        obj.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
