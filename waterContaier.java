// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0; int right = height.length - 1;
        // Iterate over the array
        while(left < right) {
            //Calculate area of each new sub array
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(area, maxArea);
            
            if(height[left] < height[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }
}
