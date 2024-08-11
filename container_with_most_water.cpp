// Time : o(n)
// space : constant

class Solution {
public:
    int maxArea(vector<int>& height) {
        int p1 = 0;
        int p2 = height.size() -1;
        int max_area = 0;

        while(p1<p2)
        {
            max_area = max(max_area,(p2-p1)*(min(height[p1], height[p2])));
            (height[p1] <= height[p2]) ? p1++ : p2--;
        }

        return max_area;
    }
};