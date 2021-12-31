// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {

        int result = 0;
        int low = 0;
        int high = height.length - 1;

        while(low < high){
            result = Math.max(result, Math.min(height[low], height[high])*(high-low));
            if(height[low] <= height[high])low++;
            else high--;
        }
        
        return result;
    }
} 