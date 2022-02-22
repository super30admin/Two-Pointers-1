// Time Complexity : O(n) where n = length of nums array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

import java.util.*;
public class Problem1 {
   
    // Function to swap elements at 2 indices in an array
    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
    public static void sortColors(int[] nums) {
        int l = 0, r = nums.length-1, curr = 0;
        while (curr <= r) {
            // If element at current pointer is 0, swap it with the element at the left pointer index and increment both current and left pointers by 1
            if (nums[curr] == 0) {
                swap(nums, l, curr);
                curr++;
                l++;
            } else if (nums[curr]== 1) { // If element at current pointer is 1, do nothing and increment current pointer
                curr++;
            } else { // If element at current pointer is 2, swap it with the element at the right pointer index and decrement the right pointer by 1
                swap(nums, curr, r);
                r--;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
