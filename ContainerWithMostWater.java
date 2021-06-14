//Time Complexity: O(N)
//Space Complexity: O(1)

public class Solution {
    public int maxArea(int[] height) {
        int area = 0, l = 0, r = height.length - 1;
        while (l < r) {
            area = Math.max(area, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else
                r--;
        }
        return area;
    }
}
