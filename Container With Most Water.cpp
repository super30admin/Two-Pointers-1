// TC = O(n)
// SC = O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    int maxArea(vector<int>& height) {
        // null
        if(height.size() == 0) return 0;
        int n = height.size();
        int low = 0, high = n - 1, maxA = 0, start = 0, end = 0;
        while(low < high) {
            // currentArea = height * width
            int currA = min(height[low], height[high]) * (high - low);
            // storing the start and low index of the container with most water
            if(currA > maxA) {
                maxA = currA;
                start = low;
                end = high;
            }
            // moving the pointers since the lowest height is the binding factor and we have to move the lowest one 
            if(height[low] < height[high]) low++;
            else high--;
        }
        return maxA;
    }
};