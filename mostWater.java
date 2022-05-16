public class mostWater {
    public int maxArea(int[] height) {
        int max = 0;
        int low = 0;
        int high = height.length - 1;
        while (low < high) {
            int currentArea = 0;
            if (height[low] < height[high]) {
                currentArea = height[low] * (high - low);
                low++;
            } else {
                currentArea = height[high] * (high - low);
                high--;
            }
            max = Math.max(max, currentArea);
        }
        return max;
    }
}