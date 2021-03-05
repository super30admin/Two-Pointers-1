// Time Complexity : O(n); n = len of array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

public class SortColors {
    public void sortColors(int[] nums) {
        int low = 0, high = nums.length - 1, mid = 0;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else if (nums[mid] == 1)
                mid++;
            else {
                swap(nums, mid, high);
                high--;
            }
        }

    }
    private void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
