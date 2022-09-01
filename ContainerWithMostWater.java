// Time complexity: O(n)
// Space complexity: O(1)

// Approach: Two pointer approach. Here we take one pointer at the start of the array and the other pointer at the end of the array. We calculate the area in the same way and update max area. Now for moving the pointers, we now that when we shrink the array (that is if any pointer moves towards the middle), so no matter what, the width will decrease. So since the width is decreasing, in order to find a bigger area when width is decreasing, we need to find a higher height. Hence we move that pointer whose height is lesser.

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int l = 0; int r = height.length-1;
        
        while (l < r) {
            int width = r - l;
            int area = Math.min(height[l], height[r]) * width; // minimum height of the two times the width
            max = Math.max(max, area);
            if (height[l] <= height[r]) {
                l++;
            }
            else {
                r--;
            }
        }
        
        return max;
    }
}