// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes, 1ms
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

// check which height is smaller on either side of the array, use that for the area calculation, increment the start and end pointer accordingly till they cross

class Solution {
    public int maxArea(int[] height) {
        
        int area = 0;
        
        int start = 0;
        
        int end = height.length - 1;
        
        while(start < end){
            
            if(height[start] < height[end]){
                
                area = Math.max(area, height[start]*(end-start));
                start++;
                
            }
            else{
                area = Math.max(area, height[end]*(end-start));
                end--;
            }
            
            
        }
        
        return area;
    }
}