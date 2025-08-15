class Solution {//tc:o(n);sc:o(1)
public:
    int maxArea(vector<int>& height) {
       int n = height.size();
        int low = 0, high = n - 1;
        int area = 0;
        while (low < high) {
            int h = 0;
            int w = high - low;

            if (height[low] < height[high]) {
                h = height[low];
                low++;
            } else {
                h = height[high];
                high--;
            }
            area = max(area, h * w);
        }
         return area;
    }
};