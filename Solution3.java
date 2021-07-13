// Time complexity: O(N), where N is the length of height array. 
// Space complexity: O(1)
// Did this code successfully run on Leetcode : Yes

public class Solution3 {
   public int maxArea(int[] height) {
        int maxArea = 0; 
        int left = 0, right = height.length-1; 
        while (left < right) {
            // update the maxArea 
            maxArea = Math.max(maxArea, Math.min(height[left], height[right]) * (right - left));
            // move the pointer which is pointing to smaller height
            if(height[left] > height[right]) right--;
            else left++;
        }
        return maxArea; 
    } 
}
