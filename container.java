// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes

class Solution {
    public int maxArea(int[] height) {
        if(height.length==0 || height==null) 
            return 0;
        
        //initialisation
        int low=0, high=height.length-1, maxArea=0;
        
        while(low<high) {
            //calculating current area
            int currArea = (high-low)*Math.min(height[low], height[high]);
            //comparing current area and maxArea and replacing maxArea if it is smaller than current area
            maxArea = Math.max(currArea, maxArea);
            //shifting the smaller pointer
            if(height[low]<height[high])
                low++;
            else
                high--;
        }
        return maxArea;
    }
}