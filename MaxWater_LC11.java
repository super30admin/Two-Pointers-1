
 // Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes


class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int max=0;
        while(i<j){
          
            if(height[i]<height[j]){
                  max = Math.max(max,(height[i]*(j-i)));
                i++;
            }
            else{
                max = Math.max(max,(height[j]*(j-i)));
                j--;
            }
        }
        
        return max;
    }
}