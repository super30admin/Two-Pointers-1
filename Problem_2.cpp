// Time Complexity : O(n^2), where n is the size of the array.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        if(nums.size()<3){
            return vector<vector<int>>();
        }
        std::sort(nums.begin(),nums.end());
        vector<vector<int>> result;
        for(int i=0; i<nums.size()-2; i++){
            if(i>0 && nums[i-1]==nums[i]) continue;
            if(nums[i]>0) break;
            int low = i+1;
            int high = nums.size()-1;
            while(low<high){
                int sum = nums[low]+nums[i]+nums[high];
                if(sum == 0){
                    vector<int> temp {nums[low],nums[i],nums[high]};
                    result.push_back(temp);
                    high--;low++;
                    while(low<high && nums[low] == nums[low-1]) {
                        low++;
                    }
                    while(low<high && nums[high] == nums[high+1]){ 
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