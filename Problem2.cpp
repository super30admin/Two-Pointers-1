// Problem - 3Sum
//  Time Complexity : O(n^2)
//  Space Complexity : O(1)
//  Did this code successfully run on Leetcode : Yes
//  Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// 1. We first sort the numbers, and fix the first element
// 2. In order to avoid duplicacy, we skip if (nums[i] == nums[i-1) and then do
// two pointers between pointer j(i+1) and k(n-1)
// 3. In order to avoid inner duplicacy, we skip one of the pointers if they are
// similar to their previous value

#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
  vector<vector<int>> threeSum(vector<int> &nums) {
    int n = (int)nums.size();
    sort(nums.begin(), nums.end());
    vector<vector<int>> out;

    for (int i = 0; i < n; i++) {
      if (nums[i] > 0)
        break;
      if (i > 0 && nums[i] == nums[i - 1])
        continue;
      int j = i + 1;
      int k = n - 1;
      while (j < k) {
        int sum = nums[i] + nums[j] + nums[k];
        if (sum == 0) {
          out.push_back({nums[i], nums[j], nums[k]});
          j++;
          while (j < k && nums[j] == nums[j - 1])
            j++;
        } else if (sum > 0) {
          k--;
        } else {
          j++;
        }
      }
    }

    return out;
  }
};
