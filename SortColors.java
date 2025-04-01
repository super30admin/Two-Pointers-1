// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Approach - This is the Dutch National Flag problem approach. We maintain three pointers (low, mid, high).
// If nums[mid] == 0, swap it with nums[low] and increment both low and mid.
// If nums[mid] == 2, swap it with nums[high] and decrement high.
// If nums[mid] == 1, just increment mid.


public class SortColors {

    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 2) {
                // Swap nums[mid] and nums[high]
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            } else if (nums[mid] == 0) {
                // Swap nums[mid] and nums[low]
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            } else { // nums[mid] == 1
                mid++;
            }
        }
    }

    //helper function to print array
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 0, 2, 1, 1, 0};
        sortColors(nums1);
        System.out.println("After sorting: ");
        printArray(nums1);

        int[] nums2 = {0, 1, 2, 2, 1, 0};
        sortColors(nums2);
        System.out.println("After sorting: ");
        printArray(nums2);

    }
}
