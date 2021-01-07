//Problem 35 : Container With Most Water
// Time Complexity :O(n^2)
// Space Complexity : O(1);
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes, in understanding the question.Then in figuring out the optimized solution 


// Your code here along with comments explaining your approach
/*
  Brute force: 
  For each element just find index difference with other elements indexes. Then find the min of both the elements. Multiply both the index difference and the minimum element for finding the max area. If current max area is greater than the global max area. Just update it, otherwise ignore it. Do this for all the elements.  
*/

class Solution35 {
    public int maxArea(int[] height) {
        
        if(height==null || height.length==0){
            return 0;
        }
        
        
        //Brute force -> TC: O(n^2), SC: O(1)
        
        int maxArea = Integer.MIN_VALUE; 
        
        for(int i=0;i<height.length;i++){
            int idxDiff = 0;
            int minHeight = -1;
             for(int j=i+1;j<height.length;j++){
                 idxDiff = j-i;
                 minHeight = Math.min(height[i],height[j]);
                 maxArea = Math.max(maxArea, minHeight*idxDiff);
             }
        }
        
        return maxArea;
    }
}