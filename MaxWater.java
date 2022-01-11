
public class MaxWater {
    // TC O(N)
    // SC O(1)
    public int maxArea(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int low = 0, high = height.length - 1;
        int max = 0;
        while (low < high) {
            int width = high - low;
            max = Math.max(max, width * Math.min(height[low], height[high]));
            if (height[low] < height[high]) {
                low++;
            } else {
                high--;
            }
        }
        return max;
    }
}
