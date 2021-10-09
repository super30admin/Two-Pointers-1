// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

public int maxArea(int[] height) {
        
    //we take 2 pointers at the end
    //the intuition behind it is that we assume maximum width
    //only when we have the pointers at the opposite ends
    if(height == null || height.length < 2) return 0;
    int left = 0, right = height.length - 1, maxArea = Integer.MIN_VALUE;
    
    while(left < right){
        
        //To calculate the area, we need width and height
        //height will be the minimum of the 2 columns as
        //the water will be spilt if we consider the maximum column
        //width will be simply the difference of the 2 pointers. It is given
        //that the width of each column is 1
        
        maxArea = Math.max(maxArea, Math.min(height[left],height[right]) *
                          (right - left));
        
        //we compare the right and left values in the height array
        //whichever column's height is taller has an increased chance
        //of finding a larger area
        if(height[left] < height[right]) left++;
        else right--;
    }
    return maxArea;
}