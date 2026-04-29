// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
// We will use two pointers, one at the beginning and one at the end of the array. 
// We will calculate the area formed by the two pointers and update the maximum area. 
// We will then move the pointer that has the smaller height, as moving the pointer with the larger height will not increase the area.
// We will continue this process until the two pointers meet.
// This approach ensures that we are checking all possible pairs of lines while maintaining a linear time complexity.
class Solution {
    public int maxArea(int[] height) {

        int left = 0, right = height.length - 1;
        int maxArea = 0;

        while (left < right) {

            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);

            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }
}