// Time Complexity : O(1)

// Space Complexity : O(1)

// Did this code successfully run on Leetcode : YES

// Appoarch: Using the two pointer method, calculated the min height
// and multiply with the units of water. Keep incrementing the low or 
// high pointer based on the smaller height.

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    int maxArea(vector<int>& height) {
        int n = height.size();
        int l=0;
        int h=n-1;
        int maxVal = INT_MIN;
        while(l<h){
            int curr = min(height[l],height[h])*(h-l);
            maxVal = max(maxVal,curr);
            if(height[l]<height[h]){
                l++;
            }
            else{
                h--;
            }
        }
        return maxVal;
    }
};