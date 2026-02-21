// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/*
Maintain 2 pointers one at left and right. We are interested to achieve maximum area which is product of
length and width.Also, to form a container,between 2 heights, only the lowest length of rod can be considered
as the rest will overflow.So, we compare and consider the length accordingly. Width can be computed by the
difference of indices. We move the left pointer if the left rod's height is small, as we want to maximize
area, if not, we decrement right pointer. This way, we can achieve max area.
 */
class Solution {
    public int maxArea(int[] height) {
        int left = 0 , right = height.length - 1;
        int maxArea = 0;
        while(left < right) {
            int width = right - left;
            int length = 0;
            if(height[left] < height[right]) {
                length = height[left];
                left++;
            }
            else {
                length = height[right];
                right--;
            }
            maxArea = Math.max(maxArea, length * width);
        }
        return maxArea;
    }
}