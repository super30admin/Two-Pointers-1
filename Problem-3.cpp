// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution
{
public:
    int maxArea(vector<int> &height)
    {
        if (height.size() < 0 || height.empty())
        {
            return 0;
        }

        int n = height.size();
        int low = 0, high = n - 1;
        int maxRes = 0;

        while (low < high)
        {
            int a = high - low;
            int b = min(height[high], height[low]);
            maxRes = max(maxRes, b * a);

            if (height[low] < height[high])
            {
                low++;
            }
            else
            {
                high--;
            }
        }

        return maxRes;
    }
};