// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int maxArea(int[] height) {
        
        // check if input array is null or empty
        if(height == null || height.length == 0) return 0;
        
        // initialize max area to 0
        int maxarea = 0;
        
        // initilaize two pointers from start and end
        int start = 0;
        int end = height.length - 1;
        
        // traverse until start is less than end pointer
        while(start < end){
            
            // caluclate the area between start and end pointer
            int calculatedArea = Math.min(height[start], height[end]) * (end - start);
            
            // update the max value if calculatedArea is greater than max
            maxarea = Math.max(maxarea, calculatedArea);
            
            // if height at start pointer is less than height at end pointer, increment the start pointer 
            // because decrementing the end pointer will make max value only smaller 
            // since height at start pointer is minimum compared to the height at end pointer
            
            if(height[start] <= height[end]){
                start++;
            }else{
                end --;
            }
        }
        
        return maxarea;
    }
}