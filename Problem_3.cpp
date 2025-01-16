// Author: Subhed Chavan
// Batch: December 24
// Problem Statement: 11: Container with most water
// Approach: 2 Pointers
// Time Complexity: O(n)

class Solution
{
public:
    int maxArea(vector<int> &height)
    {

        // Base Case
        if (height.empty() || height.size() < 2)
        {
            return 0;
        }

        int n = height.size();

        int left = 0;
        int right = n - 1;

        int max = 0;

        // Condition for while loop, till the pointers don't cross each other
        while (left < right)
        {

            // Cacluate the max
            max = std::max(max,
                           min(height[left], height[right]) * (right - left));

            // Move pointer based on the lowest height
            if (height[left] <= height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return max;
    }
};