// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

// Implemented using Two Pointers
class Solution {
public:
    int maxArea(vector<int>& height) {
        int left = 0;
        int right = height.size() - 1;
        int max_water = 0;
        while(left < right){
            max_water = max(max_water , (right - left) * min(height[left], height[right]));
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        } 
        return max_water;
    }
};

              