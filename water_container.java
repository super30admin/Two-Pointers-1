// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Couldn't solve problem before class


// Your code here along with comments explaining your approach: 
//Use two pointers to keep track of lower and higher heights. Then store the lower height, while calculating the area. 
//Once area is calculated, keep track of maximum area.

class Solution {
    public int maxArea(int[] height) {
        
        //base checks
        if(height == null || height.length == 0) return 0;
        
        //initializing pointers
        int low = 0, high = height.length -1, max_area = 0;
        
        //loop to find all the areas from the height array
        while(low<high){
        	//calculate width
            int width = high - low;

            //calculate area
            int curr_area = width * Math.min(height[low], height[high]);

            //store maximum area of each loop
            max_area = Math.max(max_area, current);
            
            //increment/decrement height
            if(height[low] < height[high]){
                low++;
            }else{
                high--;
            }
        }
        
        return max_area;
    }
}