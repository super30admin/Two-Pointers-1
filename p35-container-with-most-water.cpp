// Time complexity is O(n)
// Space complexity is O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach:
/*
  Move the pointer whose height is lower. This way, we skip checking the areas formed
  by the vertical line of smaller height with the remaining heights.
*/


class Solution {
public:
    int maxArea(vector<int>& height) {
        if(!height.size()) return 0;
        int low = 0;
        int high = height.size()-1;
        int maxArea = 0;
        while(low < high) {
            maxArea = max(maxArea,(high-low) * min(height[low], height[high]));
            if(height[low] < height[high])
                low++;
            else
                high--;
        }
        return maxArea;
    }
};
