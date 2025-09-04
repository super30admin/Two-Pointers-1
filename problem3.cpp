// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// We start with the max possible width, which translates to i @ index 0 and j @ index n-1
// At every subsequent step, we know the width will reduce as we shrink i & j pointers
// To ensure max area, we move the pointer pointing to the lesser of the 2 heights

class Solution {
public:
    int maxArea(vector<int>& height) {
        int i = 0; int j = height.size() - 1;
        int maxArea = 0;
        while(i < j) {
            int area = min(height[i], height[j]) * (j-i);
            maxArea = max(maxArea, area);
            if(height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea; 
    }
};