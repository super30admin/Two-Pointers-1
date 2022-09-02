// Time Complexity : 0(n)
// Space Complexity : 0(1)
// Did this code successfully run on Leetcode : YEs
// Any problem you faced while coding this : Initially I was using 2 pointer approach

public class problem1 {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n - 1;
        int mid = 0;
        while (mid <= high && low < high) {
            if (nums[mid] == 0) {
                nums[mid] = nums[low];
                nums[low] = 0;
                low++;
                mid++;
            } else if (nums[mid] == 2) {
                nums[mid] = nums[high];
                nums[high] = 2;
                high--;
            } else {
                mid++;
            }
        }
    }
}
