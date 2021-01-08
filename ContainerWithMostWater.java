//Problem 36 : Container With Most Water
// Time Complexity :O(n)
// Space Complexity : O(1);
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No 


// Your code here along with comments explaining your approach
/*
 Optimized:Using low and high pointers, here as height is the major constraint and going to affect the max area. If height at low pointer is smaller than the height at high pointer, just increment the low pointer. Otherwise, if height at high pointer is smaller than the height at low pointer, decrement the high pointer.  
  
  Brute force: 
  For each element just find index difference with other elements indexes. Then find the min of both the elements. Multiply both the index difference and the minimum element for finding the max area. If current max area is greater than the global max area. Just update it, otherwise ignore it. Do this for all the elements.  
*/

class Solution36 {
    public int maxArea(int[] height) {
        
        if(height==null || height.length==0){
            return 0;
        }
        
         //TC: O(n), SC:O(1)
         int maxArea = Integer.MIN_VALUE; 
        
         int low  = 0;
         int high = height.length-1; 
         
         while(low<high){
             
             int width  = high-low;//idxDiff
             int h = Math.min(height[low],height[high]);
             maxArea = Math.max(maxArea, h*width);
             
             if(height[low]<height[high]){
                 low++;
             }else{
                 high--;
             }
             
         }
         
         return maxArea;

        
        //Brute force -> TC: O(n^2), SC: O(1)
        /*int maxArea = Integer.MIN_VALUE; 
          for(int i=0;i<height.length;i++){
            int idxDiff = 0;
            int minHeight = -1;
             for(int j=i+1;j<height.length;j++){
                 idxDiff = j-i;
                 minHeight = Math.min(height[i],height[j]);
                 maxArea = Math.max(maxArea, minHeight*idxDiff);
             }
        }
        
        return maxArea;*/
    }
}