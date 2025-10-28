// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/*
 * Approach 
 * we are using 2 pointers to calculate the area
 * 
 * after calculation we compare the curr area to max area and store that
 * 
 * to move the pointer we pick the smaller value among the two and move that one 
 * 
 */

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left <= right) {
            int temp = Math.min(height[left], height[right]);
            max = Math.max(max, temp * (right - left));
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }

        }
        return max;
    }
}