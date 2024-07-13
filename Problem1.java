//Time = O(n)
//space = O(1)

class Solution {
    public void sortColors(int[] nums) {
        // Initialize three variables to keep count of red, white, and blue objects.
        int redCount = 0, whiteCount = 0, blueCount = 0;
        
        // Iterate over the array to count the number of objects of each color.
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                redCount++;
            } else if (nums[i] == 1) {
                whiteCount++;
            } else {
                blueCount++;
            }
        }
        
        // Fill the array with the appropriate number of red, white, and blue objects.
        for (int i = 0; i < nums.length; i++) {
            if (i < redCount) {
                nums[i] = 0;
            } else if (i < redCount + whiteCount) {
                nums[i] = 1;
            } else {
                nums[i] = 2;
            }
        }
    }
}
