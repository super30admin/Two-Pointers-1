/*

Time Complexity : O(n) : we travase the array only one time so n is the length of the array.

Space Complexity: O(1) : as we are not using any extra space

Leetcode : Worked on leetcode.


*/
public class sortColor {

    public void sortColors(int[] nums) {
        // taking pointers to traverse the array.

        int lo = 0;
        int mid = 0;
        int hi = nums.length - 1;

        while (mid <= hi) {
            // place in 2 at the last and swaping last element at mid.
            if (nums[mid] == 2) {

                swap(nums, mid, hi);
                hi--;
            }
            // if mid = 0 then swap with lo and increment lo and hi
            // beacause we sure lo has either 0 or 1 as mid == 2 condition put num 2 at end.
            else if (nums[mid] == 0) {

                swap(nums, lo, mid);
                lo++;
                mid++;

            }
            // if mid = 1 then just increment it.
            else {

                mid++;
            }
        }
    }

    // logic for swaping the elements.
    public void swap(int nums[], int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }
}
