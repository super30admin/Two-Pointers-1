
/**
 * Sorts an array containing only 0s, 1s, and 2s (representing colors) in-place.
 * This implements the Dutch National Flag algorithm.
 *
 * Approach:
 * - Use three pointers: `left`, `mid`, and `high`.
 * - Traverse the array with `mid`:
 *   - If nums[mid] == 0 → swap with nums[left], increment both.
 *   - If nums[mid] == 1 → just move mid.
 *   - If nums[mid] == 2 → swap with nums[high], decrement high.
 *
 * Time Complexity: O(n)
 * - Each element is visited at most once.
 *
 * Space Complexity: O(1)
 * - In-place sorting using constant extra space.
 * 
 * This code was running perfectly on Leetcode
 */

import java.util.Arrays;

public class sort_colors {

    public static void sortColors(int[] nums) {
        int left = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[left];
                nums[left] = temp;
                left++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums_1 = { 2, 0, 2, 1, 1, 0 };
        int[] nums_2 = { 2, 0, 1 };
        sortColors(nums_1);
        sortColors(nums_2);
        System.out.println(Arrays.toString(nums_1));
        System.out.println(Arrays.toString(nums_2));

    }
}
