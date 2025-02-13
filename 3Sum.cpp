// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
#include <iostream>
#include <vector>

using namespace std;


class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> ans;
        
        sort(nums.begin(), nums.end());
        for (int i =0; i<nums.size(); i++) {
            if (i>0 && nums[i] == nums[i-1]) continue;
            int l = i+1;
            int r = nums.size()-1;
            while (l<r) {
                if (nums[i] + nums[l] + nums[r] == 0) {
                    ans.push_back({nums[i], nums[l], nums[r]});
                    l++;
                    r--;
                    while (l<r && (nums[l] == nums[l-1]))
                    {l++; }
                    while (l<r && (nums[r] == nums[r+1]))
                    {r--; }
                }
                else if (nums[i] + nums[l] + nums[r] > 0) r--;
                else l++;
            }
        }
        return ans;
    }
};