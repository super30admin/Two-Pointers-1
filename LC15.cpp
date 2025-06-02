// Time complexity O(nlogn)
// Space complexity O(1)

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> result;
        int n = nums.size();
        sort(nums.begin(), nums.end());

        for (int i=0; i<n-2; i++) {
            if (i != 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int j = i+1;
            int k = n-1;
            while (j < k) {
                int target = -nums[i];
                if (nums[j] + nums[k] < target) {
                    j++;
                } else if (nums[j] + nums[k] > target) {
                    k--;
                } else {
                    result.push_back({nums[i], nums[j], nums[k]});
                    
                    while (j < k && nums[j] == nums[j + 1]) 
                        j++;
                    while (j < k && nums[k] == nums[k - 1]) 
                        k--;

                    j++;
                    k--;
                }
            }
        }
        return result;
    }
};