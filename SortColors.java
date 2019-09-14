/**
 * 
 * Given an array with n objects colored red, white or blue, sort them in-place 
 * so that objects of the same color are adjacent, with the colors in the order red, white and blue. 
 * Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

 * Approach
 * 
 * The Idea is to use the logic similar to 2 pivot quicksort's partition
 * procedure which is a modification of the original single pivot partition for
 * the case where there are duplicates in the array.
 * 
 * We can consider this instace to be a special case of the above described situation.
 * In a single pass we would be able to sort the given array.
 * 
 * >>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
 * This was initial idea, but based on the logic discussed, I was able to develop the below logic.
 * 
 * Loop Invariant:
 * 
 * A[0 .... i] A[i+1 .... j] A[j+1 .... k-1] A[k .... n-1] 
 *   0 ...  0    1 ...    1    ? ?    ... x    2 ...    2
 * 
 * 0 .. i : contains 0
 * i+1 .. j: contains 1
 * j+1 .. k-1: unprocessed, k-1 currently being processed
 * k .. n-1: contains 2
 * 
 * Space Complexity: O(1)
 * Time Complexity: O(n)
 * 
 * Leetcode Attempts: 2
 * 
 * Leetcode Results:
 * Runtime: 0 ms, faster than 100.00% of Java online submissions for Sort Colors.
 * Memory Usage: 35.4 MB, less than 99.21% of Java online submissions for Sort Colors.  
 *  
 */
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int i = -1, j = -1, k = n;
        while(k - j - 1 > 0) { // unprocessed section has elements
            if(nums[k-1] == 2) {
                k--;
            } else if(nums[k-1] == 1) {
                int temp = nums[j+1];
                nums[j+1] = nums[k-1];
                nums[k-1] = temp;
                j++;
            } else {
                int temp = nums[k-1];
                nums[k-1] = nums[j+1];
                nums[j+1] = nums[i+1];
                nums[i+1] = temp;
                i++;
                j++;
            }
        }
    }
}