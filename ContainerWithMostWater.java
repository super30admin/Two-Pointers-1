// Time complexity: O(n)
// Space complexitu - O(1)
// Solved on leetcode - yes
// Did you face any problem - No
//This algorithm uses two pointers, one at the start (left) and one at the end (right) of the array, to represent the sides of a container. 
//It calculates the area formed by these two lines and moves the pointer pointing to the shorter line inward, aiming to find a taller line and potentially a larger area. 
//This process continues until the two pointers meet, ensuring all possible container widths are checked efficiently.
class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {
            maxArea = Math.max(maxArea, (right - left) * Math.min(height[left], height[right]));

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
    return maxArea;
    }
}
