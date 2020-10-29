// Time Complexity :O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


class Solution {
    public int maxArea(int[] height) {
        
        // edge case
        if(height.length == 0 || height == null) return 0;
        
        int area = 0;
        
        // two pointers
        int i = 0; int j = height.length-1;
        
        while(i<j){
            
            // left element <  right element
            if(height[i]<height[j]){
                area = Math.max(area,height[i]*(j-i));
                i++;
                // right element >= left element
            }else{
                 area = Math.max(area,height[j]*(j-i));
                j--;
            }
            
       
        }
        
        return area;
    }
}