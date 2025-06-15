class Solution {
    public void sortColors(int[] nums) {
        // Count the occurrences of each color (0, 1, 2)
        int[] counts = new int[3];

        // Iterate through the original array to count occurrences
        for (int num : nums) {
            counts[num]++;
        }

        // Overwrite the original array based on the counts
        int index = 0;

        // Iterate through each color (0, 1, 2)
        for (int color = 0; color <= 2; color++) {
            // Repeat for the count of occurrences of the current color
            for (int count = 0; count < counts[color]; count++) {
                // Overwrite the original array with the current color
                nums[index] = color;
                index++;
            }
        }
        
    }
}


// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

// You must solve this problem without using the library's sort function.

 

// Example 1:

// Input: nums = [2,0,2,1,1,0]
// Output: [0,0,1,1,2,2]
// Example 2:

// Input: nums = [2,0,1]
// Output: [0,1,2]
 

// Constraints:

// n == nums.length
// 1 <= n <= 300
// nums[i] is either 0, 1, or 2.