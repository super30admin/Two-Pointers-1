// Time Complexity : o(nlogn)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : NO

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        if(nums.size()<3)return {};
        sort(nums.begin(), nums.end());
        int i=0;
        int n = nums.size();
        vector<vector<int>> ans;
        while(i < n) {
            if(i == 0 || nums[i] != nums[i-1]) {
                int a = nums[i];
                int low = i+1;
                int high = n-1;
                while(low < high) {
                    int sum = nums[low] + nums[high];
                    if(sum == -a) {
                        ans.push_back({a, nums[low], nums[high]});
                        while(low < high && nums[low] == nums[low+1]) {
                            low++;
                        }
                        while(high > low && nums[high] == nums[high-1]) {
                            high--;
                        }
                        low++;
                        high--;
                    } else if(sum < -a) {
                        low++;
                    } else {
                        high--;
                    }
                }
            }
            i++;
        }
        return ans;
    }
};