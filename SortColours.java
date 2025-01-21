import java.util.Arrays;

// Time Complexity: O(n)
// Space Complexity: O(1) as the swapping is done in in-place(without creating extra space)

// The static check conditions are applied for 0, 1 and 2 using three pointers.
// The requirement is 0 should be most left, 1 in the middle and 2 in the right.
// When the condition satisfies, swapping is carried and the pointer is increased.
public class SortColours {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortColors(new int[] { 2, 0, 2, 1, 1, 0 }))); // [0,0,1,1,2,2]
        System.out.println(Arrays.toString(sortColors(new int[] { 2, 0, 1 }))); // [0,1,2]
        sortColors(new int[] { 2, 0, 1 }); // [0,1,2]
    }

    public static int[] sortColors(int[] nums) {
        if (nums == null || nums.length == 0)
            return new int[] {};
        int left = 0;
        int n = nums.length;
        int right = n - 1;
        int mid = 0;
        while (mid <= right) {
            if (nums[mid] == 0) {
                swap(nums, left, mid);
                left++;
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, right);
                right--;
            } else {
                swap(nums, mid, left);
                mid++;
            }
        }
        return nums;
    }

    private static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}