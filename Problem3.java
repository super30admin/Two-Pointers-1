// ## Problem3 (https://leetcode.com/problems/container-with-most-water/)
class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int n = height.length;
        int left = 0;
        int right = n-1;
        while (left < right) {
            int aurrArea = Math.min(height[left],height[right]) * (right-left);
            max = Math.max(max,aurrArea);
            if (height[left] <= height[right]) left++;
            else right--;
        }
        return max;
    }
}