import java.util.Arrays;

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
three pointers
1st keep track of 0's
2nd keep track of 2's
3rd index over the array
 */

public class SortColors {

    public static void main(String[] args) {

//        int[] nums = {2, 0, 2, 1, 1, 0};
        int[] nums = {2,0,1};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void sortColors(int[] nums) {

        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int mid = 0;

        while (mid <= right) {

            if (nums[mid] == 2) {
                swap(nums, mid, right);
                right--;
            } else if (nums[mid] == 0) {
                swap(nums, left, mid);
                left++;
                mid++;
            } else {
                mid++;
            }
        }
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
