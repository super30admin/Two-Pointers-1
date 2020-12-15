// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Yes

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> result;
        sort(nums.begin(), nums.end());
        if(nums.size()==0){
            return {};
        }
        int n = nums.size();
        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int low = i+1, high = n-1;
            while(low<high){
                int sum = nums[i]+nums[low]+nums[high];
                if(sum==0){
                    vector<int> triplet(3, 0);
                    triplet[0] = nums[i];
                    triplet[1] = nums[low];
                    triplet[2] = nums[high];
                    result.push_back(triplet);
                    low++;
                    high--;
                    while(low<high && nums[low]==nums[low-1]){
                        low++;
                    }
                    while(low<high && nums[high]==nums[high+1]){
                        high--;
                    }
                }
                else if(sum<0){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        return result;
    }
};
