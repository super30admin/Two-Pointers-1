package week3;

public class Container {

    public int maxArea(int[] heights) {
        int area = 0;
        int low = 0;
        int high = heights.length - 1;

        while(low < high) {
            int w = high - low;
            int h = 0;

            if(heights[low] < heights[high]) {
                h = heights[low];
                low++;
            } else {
                h = heights[high];
                high--;
            }
            area = Math.max(area, h*w);

        }
        return area;
    }

    public int maxAreaPointers(int[] heights) {
        int area = 0;
        int low = 0;
        int start = 0;
        int end = 0;
        int high = heights.length - 1;

        while(low < high) {
            int w = high - low;
            int h = 0;

            if(heights[low] < heights[high]) {
                h = heights[low];
                if(area < h*w) {
                    area = h*w;
                    start = low;
                    end = high;
                }
                low++;
            } else {
                h = heights[high];
                if(area < h*w) {
                    area = h*w;
                    start = low;
                    end = high;
                }
                high--;
            }
        }
        return area;
    }
}
