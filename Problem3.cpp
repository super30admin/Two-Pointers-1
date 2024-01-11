// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO
class Solution {
public:
    int maxArea(vector<int>& height) {

        int i = 0;
        int j = height.size()-1;
        int water = 0;
        int ans = -1;

        while(i<j)
        {
            water=min(height[i],height[j])*(j-i);
            ans=max(ans,water);
            if(height[i]<height[j])
            {
                i++;
            }
            else
            {
                j--;
            }
        }
        return ans;
    }
};