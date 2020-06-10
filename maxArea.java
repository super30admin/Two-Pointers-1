// Time Complexity :O(n) n is the array length;
// Space Complexity :O(1);
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach


class Solution {
    public int maxArea(int[] height) {
        int n = height.length-1;
        int low = 0; int high = n;
        int max = 0;
        while(high - low > 0){
            int area = (high -low) * (Math.min(height[low],height[high]));
            if(area>max) max = area;
            if(height[low]>height[high]){
                high -- ;
            }
            else{
                low ++ ;
            }
        }
        
        return max;
    }
}