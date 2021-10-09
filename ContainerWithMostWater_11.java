// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        
        if(height == null || height.length == 0){
            return -1;
        }
        
        int i=0;
        int j=height.length-1;
        int maxArea = Integer.MIN_VALUE;
        
        while(i<=j){
            
            maxArea =Math.max(maxArea, Math.min(height[i],height[j])*(j-i));
           
            if(height[i] < height[j]){
               i++;
            }else {
                j--;
            }
        }
        
        return maxArea;
        
    }
}

//TC: O(n)
//SC: O(1)