
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : No

// ## Problem1 (https://leetcode.com/problems/sort-colors/)

import java.util.Arrays;

public class SortColors {
    public void sortColors(int[] nums) {
        int prev = 0, curr = 0;
        int next = nums.length - 1;

        while (curr <= next) {
            if (nums[curr] == 2) {
                int temp = nums[curr];
                nums[curr] = nums[next];
                nums[next] = temp;
                next--;
            } else if (nums[curr] == 0) {
                int temp = nums[curr];
                nums[curr] = nums[prev];
                nums[prev] = temp;
                prev++;
                curr++;
            } else {
                curr++;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = { 2, 1, 2, 0, 1, 0 };
        System.out.println("Input before Sorted Colors: " + Arrays.toString(nums));
        SortColors obj = new SortColors();
        obj.sortColors(nums);
        System.out.println("After sorting the colors: " + Arrays.toString(nums));
    }
}
