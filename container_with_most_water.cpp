// Time Complexity: O(n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes

// Approach:
// 1. We will use two pointers i and j at the start and end of the array.
// 2. We will calculate the area using the formula min(height[i], height[j]) * (j - i) and update the maximum area.
// 3. If height[i] <= height[j], we will increment i else decrement j.

class Solution {
public:
    int maxArea(vector<int>& height) {
        int i = 0, j = height.size() - 1, area = 0;
        while(i<j){
            area = max(area, ((j - i) * min(height[j], height[i])));
            if(height[i] <= height[j]){i++;}
            else{j--;}
        }
        return area;
    }
};