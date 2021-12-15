//Time complexity : O(n logn)
//Space Complexity : O(1)
//Leetcode : Yes
//Approach:
            // Keep first integer constant and apply two pointer approach to rest of the array
            // Find sum of nums[i] nums[l] nums[r]
            // if it is 0 then add it to resultant array
            // if not adjust left and right accordingly

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        if(nums.size() < 3)
            return {};
        
        vector<vector<int>> result;
        sort(nums.begin(), nums.end());
        int i = 0;
        while(i < nums.size() - 2)
        {
            int l = i + 1;
            int r = nums.size() - 1;
            
            while(l < r)
            {
                int sum = nums[i] + nums[l] + nums[r];

                if(sum == 0)
                {
                    result.push_back({nums[i],nums[l],nums[r]});
                    l++;
                    r--;
                    while(nums[l] == nums[l - 1] && l < r)
                    {
                        l++;
                    }
                    while(nums[r] == nums[r + 1] && r > l)
                    {
                        r--;
                    }
                }
                else if(sum > 0)
                {
                    r--;
                    while(nums[r] == nums[r + 1] && r > l)
                    {
                        r--;
                    }
                }
                else
                {
                    l++;
                    while(nums[l] == nums[l - 1] && l < r)
                    {
                        l++;
                    }
                }
            }
            while(nums[i] == nums[i + 1] && i < nums.size() - 2)
            {
                i++;
            }
            i++;
        }
        return result;
    }
};