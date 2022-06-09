// approch 1
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// approch 2
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : yes I have faced problem during swapping the 2 with right pointer and I am increasing  the i pointer also

import java.util.Arrays;

class Main {
    public static void sortColors1(int[] nums) {

        // to store count of red white and blue
        int red = 0, white = 0, blue = 0;

        // in the first pass I will count all colors
        for (int i = 0; i < nums.length; i++) {
            // here I am counting the number of red blue and white colors
            if (nums[i] == 0)
                red++;
            else if (nums[i] == 1)
                white++;
            else if (nums[i] == 2)
                blue++;
        }

        // in second pass I will modify the original array
        for (int i = 0; i < red; i++) {
            nums[i] = 0;
        }
        for (int i = red; i < white + red; i++) {
            nums[i] = 1;
        }
        for (int i = red + white; i < red + white + blue; i++) {
            nums[i] = 2;
        }
    }

    public static void sortColors2(int[] nums) {
        // here we are using three pointers
        // two pointer for maitaining the left most side 0 and right pointer for
        // maintaning the right most side 2
        int l = 0;
        int r = nums.length - 1;
        int i = 0;

        // traverse in array until i pointer is less than equal r
        while (i <= r) {
            // if we find number 0 we are swapping with left pointer and increase left
            // pointer by one and increase i pointer as we want all 0s at left side
            if (nums[i] == 0) {
                swap(nums, l, i);
                l++;
                i++;
            } else if (nums[i] == 2) {
                // if nums ==2 we swap it with last pointer and decrease right pointer by one
                // here we are not increasing i pointer as there may be possible swapped value
                // is 0 so we again have to swap to the left pointer
                swap(nums, r, i);
                r--;
            } else {
                // else we increase left pointer
                i++;
            }
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 0, 2, 1, 1, 0 };
        sortColors1(nums);
        System.out.println(Arrays.toString(nums));
        nums = new int[] { 2, 0, 2, 1, 1, 0 };
        sortColors2(nums);
        System.out.println(Arrays.toString(nums));
    }
}