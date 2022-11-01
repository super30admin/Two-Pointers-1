/ Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> ret;
        sort(nums.begin(), nums.end());
        for(int i = 0; i< nums.size() - 2; i++) {
            int l = i + 1;
            int h = nums.size() - 1;
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            while (l < h) {
                int sum = nums[i] + nums[l] + nums[h];
                if (sum == 0) {
                    vector<int> v = {nums[i], nums[l], nums[h]};
                    ret.push_back(v);
                    l++; h--;
                    while (l < h && nums[l] == nums[l-1]) {
                        l++;
                    }
                    while (l< h && nums[h] == nums[h + 1]) {
                        h--;
                    }
                } else if (sum < 0) l++;
                  else h--;
            }
        }
        return ret;
    }
};
