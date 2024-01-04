// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// Idea here is use two pointers (start and end) and see if area is max in each case.
// We move towards left if left height is smaller and we move towards right if right height is smaller.

#include<vector>

class Solution {
public:
    int maxArea(std::vector<int>& height) {
        int left = 0;
        int max = 0;
        int right = height.size()-1;

        while(left < right)
        {
            // calculate area between left and right pointers
            int curr = std::min(height[left], height[right]) * (right - left);
            // Check if it is max, if not store the max value
            if (max < curr)
            {
                max = curr;
            }

            // update left and right. We always go away from smaller height
            if(height[left] < height[right])
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