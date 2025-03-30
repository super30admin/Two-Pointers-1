//Time Complexity: O(n)
//Space Complexity: O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

//Leetcode : https://leetcode.com/problems/sort-colors/

/**
 * Uses a two-pointer approach to sort an array of 0s, 1s, and 2s in-place.
 * 1. Maintain three pointers: `p0` for 0s, `p2` for 2s, and `curr` for iteration.
 * 2. Swap elements to place 0s at the beginning and 2s at the end while iterating.
 * 3. Continue until all elements are sorted in a single pass (O(n) time complexity).
 */

public class SortColors {
    public void sortColors(int[] nums) {
        int p0 = 0;
        int p2 = nums.length -1; 
        int curr = 0; 
        int temp;

        while(curr <= p2) {
            if(nums[curr] == 0) {
                temp = nums[curr];
                nums[curr] = nums[p0];
                nums[p0] = temp;
                p0++;
                curr++;
            }
            else if(nums[curr] == 2) {
                temp = nums[p2];
                nums[p2] = nums[curr];
                nums[curr] = temp;
                p2--;
            }
            else {
                curr++;
            }
        }
    }
}
