// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No

//Time Complexity : O(n) since we are iterating through the array
//Space Complexity: O(1) since we are not taking any extra space

public int maxArea(int[] height) 
    {        
        int left = 0;
        int right = height.length - 1; 
        int max = Integer.MIN_VALUE;
        while(left < right){
            int width = right - left;
            
            //Width * height is the area, but width keeps on decreasing
            // as we move the pointers, so the only ideal way of hitting
            // that maximum area would be based on the better height.This
            // dictates my pointer movement. The pointer at the minimum 
            // height moves left or right accordingly
            
            if(height[left] < height[right])
            {                
                max = Math.max(max, width * height[left]);
                left++;
            }
            else if(height[right] < height[left]){
                max = Math.max(max, width * height[right]);
                right--;
            }
            else{
                max = Math.max(max, width * height[right]);
                left++;
                right--;
            }            
        }        
       return max;
 }