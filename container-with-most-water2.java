//Time complexity: O(n)
//Space complexity: O(1)
class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max_area = 0;
        while(start < end) {
            max_area = Math.max((end - start) * Math.min(height[start], height[end]), max_area);
            if(height[start] < height[end]) {
                start++;
            }
            else {
                end--;
            }
        }
        return max_area;
    }
}