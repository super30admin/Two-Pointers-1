// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes

class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length-1;
        while(left<right) {
            int currCapacity = Math.min(height[left], height[right]) * (right-left);
            max = Math.max(max, currCapacity);
            if(height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}