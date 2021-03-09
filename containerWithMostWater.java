// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes


// Your code here along with comments explaining your approach

//two pointers
//increment the low pointer if low is constranting or high if high is constrainting. Do this until
//we reach a point where low<high and compute the max area at each point in order to get max area. 
class Solution {
    public int maxArea(int[] height) {
        //edge case
        if(height == null || height.length == 0){
            return 0;
        }
        
        int max = 0;
        
        int low = 0;
        int high = height.length-1;
        
        while(low<high){
            max = Math.max(max, Math.min(height[low], height[high]) * (high-low));
            if(height[low] < height[high]){
                low++;
            }
            else{
                high--;
            }
        }
        return max;
    }
}

//Bruteforce method
//Explore all combinations of all the heights using nested iterations(for loops) and find max iterations.
// Time Complexity : O(n^2)
// Space Complexity : O(1)

/*
class Solution {
    public int maxArea(int[] height) {
        //edge case
        if(height == null || height.length == 0){
            return 0;
        }
        
        int max = 0;
        
        for(int i = 0;i < height.length - 1;i++){
            for(int j = i + 1; j < height.length; j++){
                max= Math.max(max, Math.min(height[i],height[j]) * (j-i) );
            }
        }
        return max;
        
    }
}
*/