// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int maxArea(int[] height) {
        int ans = 0;
        int left = 0, right = height.length - 1;
        while(left < right){
            int area = (right - left)*(Math.min(height[left],height[right]));
            ans = Math.max(ans,area);
            if(height[left]<height[right])
                left++;
            else right--;
        }
        return ans;
    }
}