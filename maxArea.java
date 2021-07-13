// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class containerMaxArea {
    public int maxArea(int[] height) {
        //base case to check if the array is empty
        if(height == null || height.length == 0)
            return 0;
        
        int low = 0, n = height.length, high = n - 1;
        
        int maxArea = 0;
        
        //condition to stop iterations once low and high are same
        while(low<high){
            //calculate the area
            int currContainer = (high - low) * Math.min(height[low], height[high]);
            
            //update the maxArea
            maxArea = Math.max(maxArea, currContainer);
            
            if(height[low] <= height[high]){
                low++;
            }
            else{
                high--;
            }
            
        }
        return maxArea;
    }
}