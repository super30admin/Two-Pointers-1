//Time : O(n log n + n2) ==> O(n^2)
//Space: O(1)
//Leetcode : yes
//Issue seen: none

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> res;
        int n = nums.size();
        
        if (n < 3)
            return res;
            
        sort(nums.begin(), nums.end());
        if (nums[0] > 0)
            return res;
        for (int i = 0; i < n - 2; i++) {
            int j=i+1, k=n-1;
            if(i > 0 && nums[i] == nums[i-1]) continue;
          
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    res.push_back({nums[i], nums[j], nums[k]});
                    j++;
                    k--;
                    while (nums[j] == nums[j - 1] && j<k) {
                        j++;
                    }
                    while (nums[k] == nums[k + 1] && j<k) {
                        k--;
                    }
                } else if (sum < 0) {
                    j++;

                } else {
                    k--;
                }
            }
        }
        return res;
    }

}
;
