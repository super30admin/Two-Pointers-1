// Time Complexity:  O(n/2)
// Space Complexity: O(1)

class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int n = height.length;
        int right = n - 1;
        int area = 0;
        while (left < right){
            
            int width = right - left;
            area = Math.max(area, width * Math.min(height[left], height[right]));
            
            if(height[left] <= height[right]){
                left++;
            } else {
                right--;
            }
        }
        return area;
    }
}