/**
## Problem3 (https://leetcode.com/problems/container-with-most-water/)
 
Time Complexity :   O (N) 
Space Complexity :  O (1) 
Did this code successfully run on Leetcode :    Yes (11. Container With Most Water)
Any problem you faced while coding this :       No
 */

class MaxArea {
    public int maxArea(int[] height) {
        int max = 0;

        // take 2 pointer, start and end
        int start = 0;
        int end = height.length - 1;
        
        // check the max capacity between start and end
        while (start < end){
            int currArea = Math.min(height[start], height[end]) * (end - start);
            max = Math.max(max, currArea);
            
            // move the pointer with less height
            if(height[start] < height[end])
                start++;
            else
                end --;    
        }
        return max;
    }

    public static void main(String args[]) 
    { 
        MaxArea obj = new MaxArea();
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.print(obj.maxArea(nums));
    }
}