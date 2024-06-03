// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {

    public int maxArea(int[] height) {
 
        int max = 0;
        int low = 0;
        int high = height.length - 1;
        while (low < high){
            int currentArea = 0;
            if(height[low] < height [high]){
                currentArea = height[low] * (high - low);
                low++;
            } else {
                currentArea = height[high] * (high - low);
                high--;
            }
            max = Math.max(max, currentArea);
        }
       return max;
    }
 }