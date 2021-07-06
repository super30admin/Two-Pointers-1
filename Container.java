// Time Complexity : for 1st approach O(n^2), 2nd O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    // public int maxArea(int[] height) {
    //     int max = Integer.MIN_VALUE; // to update max
    //     for(int i = 0; i < height.length; i++){
    //         for(int j = i+1; j < height.length; j++){// nested loop
    //             int min = Math.min(height[i], height[j]); //restriction between the two, so min between the two hights
    //             max = Math.max(max, min * (j-i)); //Calculate the area.
    //         }
    //     }
    //     return max;
    // }
    
    //Another approach from j to i in one pass.
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int i= 0; // left pointer
        int j = height.length-1; //last pointer
        while(i < j){
            int min = Math.min(height[i], height[j]);
            max = Math.max(max, min * (j-i));
            if(height[i] < height[j]){ //Move i forward, j backwards
                i++;
            }else{
                j--;
            }
        }
        return max;
        
    }
}