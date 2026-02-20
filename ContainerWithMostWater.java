// Two pointers O(n) time, O(1) space
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        
        int area = 0;
        int maxArea = 0;

        for (int i = 0; i < height.length; i++) {
            int width = right-left;
            int effectiveHeight = Math.min(height[left], height[right]); // height is limited by min height between left and right
            area = width * effectiveHeight;
            maxArea = Math.max(maxArea, area);

            if (height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea;
    }
}