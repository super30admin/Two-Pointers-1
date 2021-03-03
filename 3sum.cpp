// Time Complexity -> O(n*n)
// Space Complexity -> O(1)

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>>result;
        sort(nums.begin(),nums.end());
        
        int target = 0;
        for(int i = 0; i < nums.size();){
            int l = i+1;
            int r = nums.size()-1;
            
            while(l < r){
                int current_sum = nums[i]+nums[l]+nums[r];
                if(current_sum == target){
                    result.push_back(vector<int>{nums[i],nums[l],nums[r]});
                    while(++l < nums.size() && nums[l]==nums[l-1]);
                    while(--r <nums.size() && nums[r]==nums[r+1]);
                    
                }
                else if(current_sum < target){
                    while(++l < nums.size() && nums[l]==nums[l-1]);
                }
                else{
                    while(--r <nums.size() && nums[r]==nums[r+1]);
                }
            }
            while(++i <nums.size() && nums[i]==nums[i-1]);
        }
        return result;
        
        
        
    }
};