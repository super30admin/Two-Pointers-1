// Time Complexity : O(n) where 'n' is the length of the height.
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes, https://leetcode.com/problems/container-with-most-water/
// Any problem you faced while coding this : No


class Solution {
    public int maxArea(int[] height) {
        if(height.length==0) return 0;
        int left = 0, right = height.length-1;
        int maxArea = Integer.MIN_VALUE;
        while(left<right){
            maxArea = Math.max(maxArea,Math.min(height[left],height[right])*(right-left));
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
}
