//Time complexity is O(n)
//Space Complexity is O(1)
class Solution {
    public int maxArea(int[] height) {
        if (height == null || height.length <= 1) {
            return 0;
        }

        int n = height.length;
        int max = 0;
        int low = 0;
        int high = n - 1;

        while (low < high) {
            int area = Math.min(height[low], height[high]) * (high - low);
            max = Math.max(area, max);

            if (height[low] < height[high]) {
                low++;
            } else {
                high--;
            }
        }

        return max;
    }
}