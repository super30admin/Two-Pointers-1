// Approach: Count no.of 0s, 1s, and 2s in the given array and overwrite the array with the total number of 0's, then 1's
// and followed by 2's.
// Time Complexity: O(n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// https://leetcode.com/problems/sort-colors/description/

import java.util.Arrays;

public class SortColors {

    void sortColors(int[] arr) {
        int zeroes = 0, ones = 0, twos = 0;
        for (int i: arr) {
            if (i == 0) {
                zeroes++;
            } else if (i == 1) {
                ones++;
            } else {
                twos++;
            }
        }
        int i = 0;
        while (zeroes-- > 0) {
            arr[i++] = 0;
        }
        while (ones-- > 0) {
            arr[i++] = 1;
        }
        while (twos-- > 0) {
            arr[i++] = 2;
        }
    }

    public static void main(String[] args) {
        SortColors sc = new SortColors();
        // Input: nums = [2,0,2,1,1,0]
        // Output: [0,0,1,1,2,2]
        int[] arr = { 2, 0, 2, 1, 1, 0 };
        sc.sortColors(arr);
        System.out.println("Colors after sorting: " + Arrays.toString(arr));
    }
}