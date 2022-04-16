// Time Complexity                              :  O(N Log N)
// Space Complexity                             :  O(1)
// Did this code successfully run on Leetcode   :  Yes
// Any problem you faced while coding this      :  No

#include <bits/stdc++.h> 
using namespace std;  

// https://leetcode.com/problems/3sum/
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        int n = nums.size();
        sort(begin(nums),end(nums));
        
        vector<vector<int>> ans;
        int target = 0;
        
        // brute force 
        
        // sort and search - O(N Log N), O(1).
        for(int i=0;i<n-2;i++) {
            if(i > 0 and nums[i-1] == nums[i]) continue;
            int l = i+1;
            int r = n-1;
            
            while(l < r) {
                
                int sum = nums[i] + nums[l] + nums[r];
                
                if(sum == target) {
                    ans.push_back({nums[i],nums[l],nums[r]});
                    l++;
                    r--;
                    while(r > l and nums[r] == nums[r+1]) r--;
                    while(r > l and nums[l] == nums[l-1]) l++;
                } else if (sum > target) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return ans;
    }
    
    // hashset technique
    vector<vector<int>> threeSum2(vector<int>& nums) {
        int n = nums.size();
        sort(begin(nums),end(nums));
        int target = 0;
        
        set<vector<int>> ans2;
        vector<vector<int>> ans3;
        
        // hashset in c++
        unordered_set<int> hashset;
        
        for(int i = 0;i < n-1; i++) {
            if(i > 0 and nums[i] == nums[i-1]) continue;
            
            int target2 = target - nums[i]; // target = 0 in this problem
            hashset.clear();
            
            for(int j = i+1; j < n; j++) {
                if (hashset.find(target2 - nums[j]) != hashset.end()) {
                    
                    vector<int> temp_array{nums[i], target2 - nums[j], nums[j]};
                    sort(begin(temp_array), end(temp_array));
                    
                    ans2.insert(temp_array);
                    
                } else {
                    
                    hashset.insert(nums[j]);
                }
            }
            
        }
        
       for(auto vec : ans2){
           ans3.push_back(vec);
       }
        
        return ans3;
    }
    
    
};