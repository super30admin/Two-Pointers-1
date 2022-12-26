// CONTAINER WITH MOST WATER

// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : - 


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int low = 0;
        int high = height.length - 1;
        int area = 0;

        while(low < high){
            if(height[low] <= height[high]){
                area = height[low] * (high - low);
                low++;
            } else {
                area = height[high] * (high - low);
                high--;
            }
            max = Math.max(max, area);
        }
        return max;
    }
}