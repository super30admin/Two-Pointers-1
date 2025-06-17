// Time Complexity = O(n)
// Space complexity = O(1)
/* Approach : Start with two pointers, one at the beginning and one at the end of the
 array. Calculate the area formed between the lines at these two pointers, 
 determined by the shorter of the two lines multiplied by the distance between them.
 Keep track of the maximum area found so far. Move the pointer pointing to the 
 shorter line inward, as this might give a chance to find a taller line that can 
 potentially form a larger area. Continue this process until the two pointers meet, 
 and the maximum area is found during this process.
 */

class Solution {
    public int maxArea(int[] height) {
        if (height.length == 0) return 0;                               // validate if array is empty

        int n = height.length;                                          // length of the array
        int max = 0;                                                    // Initialize the maximum area to 0
        int l = 0;                                                      // low pointer starting at the beginning of the array
        int h = n - 1;                                                  // high pointer starting at the end of the array

        while (l < h) {                                                 // validate if low is less than high
            int currVal = Math.min(height[l], height[h]) * (h - l);     // Calculate the area formed by the lines at the two pointers
            max = Math.max(max, currVal);                               // Update the maximum area if the current area is larger
            if (height[l] <= height[h]) {                               // Move the pointer pointing to the shorter line inward
                l++;
            } else {
                h--;
            }
        }
        
        return max;
    }
}
