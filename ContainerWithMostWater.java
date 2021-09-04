// Time Complexity : O(n) single iteration over all the elements
// Space Complexity : O(1) no auxilary data structure used for processing
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class ContainerWithMostWater {
    public int maxArea(int[] height) {
        //null check 
        if(height.length == 0 || height == null) return 0;
        
        int low = 0; //first pointer
        int high = height.length - 1; //last pointer
        
        int max = 0; //initializing result int
        
        while(low < high) { //looping till exhausting all elements
            
            //(high-low) will give breadth and smallest of two towers is the height
            int area = (high-low) * Math.min(height[low], height[high]); 
            //area = breadth * height
            
            max = Math.max( max, area );
            //overriding max with maximum area found till now
            
            if(height[low] < height[high]) {
                low++; //if the low height is less, move towards right from left
            }
            else {
                high--; //if the high height is less, move towards left from right
            }
        }
        return max;
    }
}