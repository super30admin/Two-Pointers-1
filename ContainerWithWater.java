// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public int maxArea(int[] height) {
        int max = Integer.MIN_VALUE;
        int left = 0;
        int right = height.length - 1;
        while(left < right) {
            //taking the maximum from comparing the heights from left pointer to right, considering the min, multiplying it with right minus left - distance of width
            max = Math.max(max, Math.min(height[left], height[right])*(right-left));
            //whichever is minimum or equal, we move the pointer
            if(height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}
// Your code here along with comments explaining your approach