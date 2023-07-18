// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

//Solution for cotainer with maximum water
// Used 2 pointers to calculate max Area and moved the pointer which has low value
class Solution {
    public int maxArea(int[] height) {
        int n = height.length;

        int maxArea = 0;
        int low = 0;
        int high = n-1;
        for(int i = 0; i<n ; i++) {
            int area = (high-low)* Math.min(height[high], height[low]);
            if(area>maxArea) maxArea = area;

            if(height[high]<height[low]){
                high--;
            }
            else{
                low++;
            }
        }

        return maxArea;
    }
}