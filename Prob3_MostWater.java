// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach



class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0)    return 0;
        
        int max = 0;
        int i = 0, j = height.length - 1;
        
        while(i < j){
            max = Math.max(max, Math.min(height[i], height[j]) * (j - i)); // If we select smaller height, it will be having width larger and Vice versa
            if(height[i] < height[j]){ //According to min heigth, calculating the area 
                i++;
            }else{
                j--;
            }
        }
        
        return max;
    }
}


/* //Brute-Force
 for(int i = 0; i< height.length - 1; i++){
            for(int j = i + 1; j< height.length; j++){
                max = Math.max(max, Math.min(height[i], height[j]) * (j- i) );
            }
        }
*/
