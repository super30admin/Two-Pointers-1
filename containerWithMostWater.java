// Time Complexity :O(n) where n is no of elements
// Space Complexity :constant
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No

//we are placing two pointers one at start and one at end,will calculate the area 
//ie.minimum height among both pointers*distance between both pointers at x axis
//after calculating area, we will update maxArea if area is larger than previous and will 
//move the pointer having smaller height until both pointers are equal or cross each other
class Solution {
    public int maxArea(int[] height) {
        if (height == null || height.length == 0)
            return 0;

        int ptr1 = 0;
        int ptr2 = height.length - 1;
        int maxArea = 0;
        while (ptr1 < ptr2) {
            int area = (ptr2 - ptr1) * Math.min(height[ptr1], height[ptr2]);
            maxArea = Math.max(maxArea, area);
            if (height[ptr1] < height[ptr2]) {
                ptr1++;
            } else {
                ptr2--;
            }

        }
        return maxArea;
    }
}