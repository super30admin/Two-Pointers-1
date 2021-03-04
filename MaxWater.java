//Time Complexity: O(n)
//Space complexity: O(1). No auxilary space is used.
//Executed on leetcode.
class Solution {
    public int maxArea(int[] height) {
        
        int maxArea = Integer.MIN_VALUE;
        
        int l =0, h= height.length-1;       //Using 2 pointers, one starting from index 0 other from index n-1. 
        
        while(l<h)
        {
            if(maxArea<Math.min(height[l],height[h])*(h-l))     //keeping track of maximum area.
            {
                maxArea = Math.min(height[l],height[h])*(h-l);     //we move the pointer to next step if the pointer is less than other, so that it ensures we calculate all possible max areas.
            }
            
            if(height[l]<height[h])
                l++;
            else
                h--;
        }
        
        return maxArea;
    }
}