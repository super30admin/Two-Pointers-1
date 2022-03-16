// Time Complexity : O(N) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r= height.length-1;
        int max =0;
        while(l<r){
            max=Math.max(max,Math.min(height[l],height[r])*(r-l));
            
            if(height[l]<height[r])
                l++;
            else
                r--;
        }
        return max;
    }
}