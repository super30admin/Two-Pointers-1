// Problem - Sort Colors
//  Time Complexity : O(n)
//  Space Complexity : O(1)
//  Did this code successfully run on Leetcode : Yes
//  Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// 1. We take 3 pointers low, mid and high, where mid collects 1, low collects 0
// and high collects 2
// 2. We move 2's the end by swapping it with high
// 3. We move 0's to the start by swapping with low moving mid forward only when
// it is 0 or 1

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
  void sortColors(vector<int> &nums) {
    int low = 0;
    int mid = 0;
    int high = (int)nums.size() - 1;
    while (mid <= high) {
      if (nums[mid] == 2) {
        swap(nums[mid], nums[high]);
        high--;
      } else if (nums[mid] == 0) {
        swap(nums[mid], nums[low]);
        mid++;
        low++;
      } else {
        mid++;
      }
    }
  }
};
