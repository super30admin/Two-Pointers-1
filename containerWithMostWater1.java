// Time Complexity :o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : yes

//a classic 2pointers problem where we made use of left and right pointers
// since we needed the max value we increment the pointer which is low of value and calulate 
//value every iteration
// Your code here along with comments explaining your approach

class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) {
            return 0;
        }
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while(left < right) {
            int result = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(max, result);
            if(height[left] > height[right]) {
                right--;
            }
            else {
                left++;
            }
        }
        return max;
    }
}