/*
Problem - Leetcode 75. Sort Colors
Approach - •
We move 0s to the front and 2s to the end, while keeping 1s in the middle.
Use three pointers: low for 0s, high for 2s, and mid to scan the array.
Swap accordingly and only move mid forward when the current item is 0 or 1.
 */
import java.util.Arrays;

public class ArrangeColors {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (mid <= high) {
            if (nums[mid] == 2) {
                swap(nums,mid,high);
                high--;
            } else if (nums[mid] == 0) {
                swap(nums,mid,low);
                mid++;
                low++;
            }
            else {
                mid++;
            }
        }
    }
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static void main(String[] args) {
        ArrangeColors a = new ArrangeColors();
        int[] nums = {2,0,2,1,1,0};
        a.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
