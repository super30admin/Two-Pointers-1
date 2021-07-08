// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class Solution {
    public int maxArea(int[] height) {
       if(height == null || height.length == 0)
           return 0;
        
        //initialize low and high pointer
        int low=0, high=height.length-1;
        //initialize max area value
        int max = 0;
        
        while(low < high){
            //calculate the current container area = width * height
            int curContainerArea = (high-low) * Math.min(height[low], height[high]);
            //check if current container area is higher than max
            max = Math.max(max, curContainerArea);
            //check if height at low is less than high
            if(height[low] < height[high])
                low++;
            else
                high--;
            
        }
        
        return max;
    }
}