// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0){
            return 0;
        }
        
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        
        while(left < right){
            max = Math.max(max, Math.min(height[left], height[right]) * (right - left));
            if(height[left] <= height[right]){
                left++; // To increase the chances of better area
            }
            else{
                right--;
            }
        }
        return max;
    }
}