// Problem - Container with most water
//  Time Complexity : O(n)
//  Space Complexity : O(1)
//  Did this code successfully run on Leetcode : Yes
//  Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// 1. We use two pointer approach, by starting at start and end
// 2. We move start if height[start] < height[end] and vice versa since height
// is the only thing which can give us maximum area, since going forward width
// is decreasing

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
  int maxArea(vector<int> &height) {
    int n = (int)height.size();
    int l = 0;
    int r = n - 1;
    int area = 0;

    while (l < r) {
      int h = min(height[l], height[r]);
      int calc = (r - l) * h;
      area = max(area, calc);
      if (height[l] < height[r]) {
        l++;
      } else {
        r--;
      }
    }

    return area;
  }
};
