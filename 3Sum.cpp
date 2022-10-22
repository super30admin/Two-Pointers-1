/*
Time Complexity: O(n^2)
Space Complexity: O(1)
Did this code successfully run on Leetcode :yes
Any problem you faced while coding this : no
*/
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> ans;
        sort(nums.begin(),nums.end());
        int n = nums.size();
        int i = 0;
        while(i<n){
            int l = i+1;
            int r = n-1;
            while(l<r){
                int s = nums[i]+nums[l]+nums[r];
                if(s==0){
                    ans.push_back({nums[i],nums[l],nums[r]});
                } 
                if(s<=0){
                    l++; while(l<r && nums[l]==nums[l-1]){l++;}
                } else {
                    r--; while(l<r && nums[r]==nums[r+1]){r--;}
                } 
            }
            i++; while(i<n && nums[i]==nums[i-1]){i++;}
        }
        return ans;
    }
};