// Time Complexity : O(n), n is the length of the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
public class sortColors {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        // keep , 3 pointer, low, mid, high. low and mid will start from 0.

        while (mid <= high) {
            // if the mid value has 2, then we have to swap it with high value and just
            // decrement high, and not increment mid, since mid can be either 0 or 1
            if (nums[mid] == 2) {
                swap(mid, high, nums);
                high--;
            }
            // check for low and mid
            else if (nums[mid] == 0) {
                swap(low, mid, nums);
                low++;
                mid++;
            }
            // if the mid is equal to 1
            else {
                mid++;
            }
        }
    }

    private void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

}
