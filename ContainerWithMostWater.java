// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int left = 0, right = height.length - 1;
        while(left < right)
        {
            int area = Math.min(height[left], height[right])* (right - left);
            max = Math.max(max, area);
            if(height[left] < height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return max;
    }
}