// Time Complexity :O(n^2) where n in the number elements in the vector
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        int low,high,sum;
        vector<vector<int>> ans;
        vector<int> res;
        if(nums.size() <= 2) return ans;
        sort(nums.begin(),nums.end());
        for(int i = 0;i<nums.size()-1;i++){
            low = i+1;high = nums.size()-1;
            if(i > 0 && nums[i-1] == nums[i]) continue;
            while(low<high){
                sum = nums[i] + nums[low] + nums[high];
                if(sum == 0 ){
                    res.clear();
                    res.push_back(nums[i]);
                    res.push_back(nums[low]);
                    res.push_back(nums[high]);
                    ans.push_back(res);
                    low++;
                    high--;
                    while(low < high && nums[low-1] == nums[low]) low++;
                    while(low < high && nums[high] == nums[high+1]) high --;
                    
                }else if(sum < 0){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        return ans;
    }
};