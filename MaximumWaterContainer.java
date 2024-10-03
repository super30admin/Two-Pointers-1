// Time Complexity : O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int low=0,high=n-1;
        int max=0;
        
        while(low<high){
            int h=0;
            int w=high-low;
            if(height[low]<height[high]){
                h=height[low];
                low++;
            }else{
                h=height[high];
                high--;
            }
            max=Math.max(max,w*h);
        }
        return max;
    }
}