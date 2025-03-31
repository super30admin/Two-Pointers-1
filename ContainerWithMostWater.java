public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int n = height.length;
        int area = 0; // a= w * h

        int low = 0, high = n - 1;

        while (low < high) {
            int w = high - low;
            int h = 0;

            if (height[low] < height[high]) {
                h = height[low];
                low++;
            } else {
                h = height[high];
                high--;
            }

            area = Math.max(area, h * w);

        }
        return area;
    }
}

/**
 * TC: O(n)
 * SC: O(1)
 */