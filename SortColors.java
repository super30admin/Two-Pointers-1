// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class SortColors {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        /*
          Three pointer low, mid, high.
          low and mid will start from 0.
         */

        while (mid <= high) {
            /*
              If the mid value has 2, then we have to swap it with high value and just
              decrement high, and not increment mid, since mid can be either 0 or 1
             */
            if (nums[mid] == 2) {
                swap(mid, high, nums);
                high--;
            }
            /*
              If the mid value has 0, then  we have to swap it with low value the increment both mid & low
            */
            else if (nums[mid] == 0) {
                swap(low, mid, nums);
                low++;
                mid++;
            }
            /*
              If the mid value has 1, then we have to just increment mid
            */
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