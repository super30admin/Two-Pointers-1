// Time Complexity : O(n^2))
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> result;
        if(nums.size()<3){
            return {nums};
        }
        sort(nums.begin(),nums.end());
              
        for(int i=0; i<nums.size()-2; i++){
            if(i!=0 && nums[i-1]==nums[i]) continue;
            int j=i+1;
            int k=nums.size()-1;
            vector<int> temp;
            while(j<k){
                if(nums[i]+nums[j]+nums[k]==0){
                    temp.push_back(nums[i]);
                    temp.push_back(nums[j]);
                    temp.push_back(nums[k]);
                    result.push_back(temp);
                    temp.clear();
                    k--;
                    j++;
                }
                else if(nums[i]+nums[j]+nums[k]<0){
                    j++;
                }else if(nums[i]+nums[j]+nums[k]>0){
                    k--;
                }
            }
        }
        
        return result;
    }
};
