//Time complexity : O(n)
//Space complexity : O(1)
//Leetcode : Yes

//Approach :
            // Keep left and right pointer
            // Calculate area using min(l , r) * r - l
            // Update maxarea if required
            // Update l, r accordingly

class Solution {
public:
    int maxArea(vector<int>& height) {
        if(height.size() == 0)
            return 0;
        
        int l = 0;
        int r = height.size() - 1;
        int maxArea = INT_MIN;
        while(l < r)
        {
            int area = (min(height[l], height[r]) * (r - l));
            maxArea = max(area, maxArea);
            if(height[l] < height[r])
            {
                l++;
            }
            else if(height[l] > height[r])
            {
                r--;
            }
            else
            {
                l++;
            }
        }
        return maxArea;
    }
};