// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    int maxArea(vector<int>& height) {
        int l = 0;
        int r = height.size()-1;
        int max_ar = 0;
        while(l<r){
            int area = 0;
            if(height[l] < height[r]){
                area = (r-l)*height[l];
                l++;
            }
            else
            {
                area = (r-l)*height[r];
                r--;
            }
            max_ar = max(max_ar, area);
        }
        return max_ar;
    }
};