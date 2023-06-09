// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    int maxArea(vector<int>& height) {
        int i = 0, j = height.size() - 1, maxV = INT_MIN;
        while (i < j) {
            maxV = max(min(height[i], height[j]) * (j - i), maxV);
            if (height[i] < height[j]) i++;
            else j--;
        }
        return maxV;
    }
};