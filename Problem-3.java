// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        while(left<right) {
            int area = 0;
            if(height[left]<height[right]) {
                area = height[left]*(right-left);
                left++;
            }
            else {
                area = height[right]*(right-left);
                right--;
            }
            if(max<area) {
                max = area;
            }
        }
        
        return max;
    }
}