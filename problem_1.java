/**
 * Q: Given an array with n objects colored red, white or blue, sort them
 * in-place so that objects of the same color are adjacent, with the colors in
 * the order red, white and blue.
 * 
 * Approach 1: Arrange each colored ball one by one. For this we need two
 * pointers and three loops(as there are three colors). In the first loop we
 * will arrange all the red(0) balls i.e move all balls marked as red to front
 * of the array. In the next loop we will arrange white starting from next index
 * where last red ball is placed. Similarly with blue ball.
 * 
 * Time Complexity : O(n) 
 * Space Complexity : O(1)
 * 
 */

class Solution {
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sortColors(int[] nums) {
        int i = 0;

        //arrange the red balls
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] == 0) {
                swap(nums, i, k);
                i += 1;
            }
        }

        //arrange the white balls
        for (int k = i; k < nums.length; k++) {
            if (nums[k] == 1) {
                swap(nums, i, k);
                i += 1;
            }
        }

        //arrange the blue balls
        for (int k = i; k < nums.length; k++) {
            if (nums[k] == 2) {
                swap(nums, i, k);
                i += 1;
            }
        }
    }
}

/** 
 * Approach 2: We can use three pointers. One pointer will point to 
 * current ball, other to next position to arranged red balls and last one to 
 * previous position to the arranged blue ball. Loop though the array, keep on arranging 
 * the red and blue balls by positioning them at their respective pointers and then 
 * shifting the pointers. On encountering a white ball just move to next ball. 
 * 
 * Time Complexity : O(n) 
 * Space Complexity : O(1)
 * 
 */
class Solution {

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sortColors(int[] nums) {
        int curr = 0, zeroP = 0, twoP = nums.length - 1;

        while (curr <= twoP) {
            
            if (nums[curr] == 0) {
                // move ball to front side of array if red
                swap(nums, zeroP, curr);
                zeroP += 1;
                curr += 1;
            } else if (nums[curr] == 2) {
                // move ball to end side of array if blue
                swap(nums, twoP, curr);
                twoP -= 1;
            } else
                // move to next ball if white
                curr += 1;
        }
    }
}