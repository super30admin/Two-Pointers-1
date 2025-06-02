// Time complexity O(n)
// Space complexity O(1)
class Solution {
public:
    int maxArea(vector<int>& height) {
        int l = 0;
        int r = height.size()-1;
        int area = INT_MIN;
        while (l < r) {
            area = max(area, (r-l) * min(height[l], height[r]));
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return area;
    }
};