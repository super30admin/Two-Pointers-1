// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    // TC: O(n) SC:O(1)
    public int maxArea(int[] height) {
        if(height == null || height.length==0) return 0;
        int low = 0;
        int high = height.length-1;
        int max= 0 ;
        while(low<high){
            int area = Math.min(height[low],height[high])*(high-low);
            if(area>max){
                max= area;
            }
            if(height[low]<height[high]){
                low++;
            }else{
                high--;
            }
        }
        return max;
    }
}