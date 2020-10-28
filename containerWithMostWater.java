// Time Complexity : o(n) 
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Leetcode : 11
//Type : 2 Pointer

class Solution {
    public int maxArea(int[] height) {
        //no edge case is required for null
        int max =0; 
        int l =0 , r = height.length-1;
        //Two pointers approach
        while(l < r){
            //area between the low and high pointers
            max = Math.max(Math.min(height[l],height[r])*(r-l),max);
            
            //move the lesser height pointer forward or backward
            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
                     
        }
        return max;
    }
}