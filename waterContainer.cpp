// Time Complexity : O(n) n is size of vector nums.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

#include <vector>
#include <iostream>

using namespace std;

class Solution {
public:
    int maxArea(vector<int>& height) {
        int ans=0;
        int i = 0;
        int j = height.size()-1;
        while(i<j)
        {
            int temp;
            if(height[i]<height[j])
            {
                temp = height[i]*(j-i);
                i++;
            }
            else
            {
                temp = height[j]*(j-i);
                j--;
            }
            ans = max(ans,temp);
        }
        return ans;
        
    }
};