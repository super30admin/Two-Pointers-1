// time: O(n)
// space: O(1)
class Solution {
public:
    int maxArea(vector<int>& height) {
        int result = INT_MIN;
        int i = 0, j = height.size()-1;
        while(j > i) {
            int smaller = min(height[i],height[j]);
            result = max(result,(smaller*(j-i)));
            if(height[i] > height[j]) {
                j--;
            }
            else {
                i++;
            }
        }
        return result;
    }
};