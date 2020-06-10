// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;
        //area = width * height
        //so area is max if both are max 
        // width is distance between two heights

        int max = 0;
        int left = 0;
        int right = height.length-1; 
        
        while(left < right) {
            int curArea = 0; 
            //find the deciding factor for height
            // get min of height of left and right pointer
            int curHeight = Math.min(height[left],height[right]);
            //find the area
            curArea = (right-left)*curHeight;
            //compare with max and set max 
            max = Math.max(max, curArea);
            
            //to change the height (to find other combinations)
            
            //if we know height[left] < height[right], 
            // we have to increase height[left] to increase the area
            // (while) continue till height[left] is not greater than the curHeight
            if(height[left] < height[right]) {
                while(left < right && height[left] <= curHeight) left++; 
            }
            //similarly for height[right]
            else {
                while(left < right && height[right] <= curHeight) right--; 
            }            
        } return max;       
    }
}

