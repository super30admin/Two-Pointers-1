// Time Complexity : O(n), where n is the number of elements in the height array
// Space Complexity : O(1), constant space used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach:
// Approach:
// Use the two-pointer technique: one pointer at the beginning (`low`), the other at the end (`high`).
// At each step, compute the area formed by the current two heights and update the max area.
// Move the pointer that has the shorter height inward to potentially find a taller line and a larger area.

class Solution {
    public int maxArea(int[] height) {
        int n = height.length;

        int low = 0;           // left pointer
        int high = n - 1;      // right pointer
        int max = 0;           // variable to track the maximum area found

        // int start = 0;
        // int end = 0;

        while (low < high) {
            int area = 0;

            // Calculate area based on the shorter height
            if (height[low] < height[high]) {
                area = height[low] * (high - low);
                low++;  // move left pointer inward to potentially find a taller height
            } else {
                area = height[high] * (high - low);
                high--; // move right pointer inward
            }

            // Update max area if current is greater
            if (area > max) {
                max = area;
                // if(height[low] < height[high]){
                //     start = low-1;
                //     end = high;
                // }else{
                //     start = low;
                //     end = high+1;
                // }
            }
        }
        //System.out.println(start+" "+end);
        return max;
    }
}