// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        
        int left = 0, right = height.length - 1;
        int maxVol = 0;
        
        while(left < right) {
            maxVol = Math.max(maxVol, Math.min(height[left], height[right]) * (right - left));
            
            if(height[left] > height[right]) {
                right--;
            }
            else if(height[right] > height[left]) {
                left++;
            }
            else {
                left++;
                right--;
            }
            
        }
        return maxVol;
        
    }
}
