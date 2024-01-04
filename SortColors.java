/*
* Approach:
*  1. Maintain three pointers,
        low => keeps track of 0's
            starting at 0
        high => keeps track of 2's
            starting at n-1
        mid => action pointer
            starting at 0

*  2. When 0 is seen by mid, swap(mid, low) and move low and mid
        when 2 is seen by mid, swap(mid, high) and update high
        when 1 is seen by mid, just move forward.
* 
*  3. When mid crosses high, stop the iteration.

    Therefore, array will be sorted.
* 
* 
* Did this code successfully run on Leetcode : YES
* 
* Any problem you faced while coding this : NO
* 
* Time Complexity: O(n)
* 
* Space Complexity: O(1)
* 
*/
public class SortColors {
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sortColors(int[] nums) {
        int low = 0, high = nums.length - 1, mid = 0;

        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            } else {
                mid++;
            }
        }
    }
}
