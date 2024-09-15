// Time Complexity :0(n) 
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length < 2)return 0;
        int max = Integer.MIN_VALUE;
        int high = (height.length)-1;
        int low = 0;
        while(low < high){
            int currArea = (high - low) * (Math.min(height[low],height[high]));
            max = Math.max(max,currArea);
            if(height[low]<=height[high]){
                low++;
            }else{
                high--;
            }
        }
       return max;
    }
}