import java.util.Arrays;
// Time Complexity : O(n) where n is the length of the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach:
// idea is to sort colors using two pointer approach as we are not supposed to use any sort functions
// so the right most element is supposed to have color 3, whenever r pointer has its color we decrement r by swapping it with mid
// same goes with left where if number satisfies we just simply swap the number and increment l pointer
public class SortColors {
    public void sortColors(int[] nums) {

        int l = 0;
        int r = nums.length - 1;
        int mid = 0;
        while (mid <= r) {
            //if mid-pointer points to color 2, then swap with right most element and decrement r
            if (nums[mid] == 2) {
                swap(nums, r, mid);
                r--;
            //if mid-pointer points to 0 swap with left most element and increment l and mid as mid which is 1 lies after l
            } else if (nums[mid] == 0) {
                swap(nums, l, mid);
                l++;
                mid++;
            } else {
                mid++;
            }
        }

    }

    //swap functionality
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }

    public static void main(String[] args) {
        SortColors sol = new SortColors();
        int[] nums = {2,0,2,1,1,0};
        sol.sortColors(nums);
        System.out.println(Arrays.toString(nums)); //Expected: {0,0,1,1,2,2}
    }
}
