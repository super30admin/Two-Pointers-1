/**
Leet Code Submitted : YES
Space Complexity : O(1)
Time Complexity : O(N)

The intuition is to check current max and increment based pointer (high/low) based on the minimum height of the bar and accordingly increase high pointer and low pointer. Finally, returing max of the area 
**/



class Solution {
    public int maxArea(int[] height) {
        
        if(height == null || height.length < 1)
            return 0;
        
        int lowPointer  = 0;
        int highPointer = height.length - 1;
        
        int max = 0;
        
       
        while(lowPointer < highPointer){
            //highPointer = nums.length - 1;
            int tempArea = Math.min(height[lowPointer],height[highPointer])*(highPointer-lowPointer);
            if(max < tempArea)
                max = tempArea;
            
            
            if(height[lowPointer] < height[highPointer])
                lowPointer ++;
            else
                highPointer --; 
            
        }
    
        return max;
    }
}
