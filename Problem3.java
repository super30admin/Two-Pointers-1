/*
    LC - 11. Container With Most Water
    TC - O(n)
    SC - O(1)
    Approach - Using Two pointer approach, calcuate the area and return the max area.
        move the pointer of the height which is lesser
        while calcuate the area, take the minimum of height to get the actual area the water can be stored.
*/

class Solution {
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) {
            return 0;
        }
        int n = height.length;
        int max = 0;
        int left = 0 , right = height.length - 1;
        while(left < right) {
            int containerWidth = right - left;
            int store = containerWidth * Math.min(height[left], height[right]);
            max = Math.max(store, max);
            if(height[left]<height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
}