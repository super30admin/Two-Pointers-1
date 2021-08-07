// Time Complexity : O(N^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        if(nums.empty() || nums.size() == 0){
            vector<vector<int>> x;
            return x;
        }
        int n = nums.size();
        vector<vector<int>> res;
        sort(nums.begin(), nums.end());
        for(int i=0; i<n; i++){
            if(nums[i]>0)
                break;
            if(i!=0 && nums[i] == nums[i-1])
                continue;
            int low = i+1, high = n-1;
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0){
                    vector<int> it = {nums[i], nums[low], nums[high]};
                    res.push_back(it);
                    low++;
                    high--;
                    while(low<high && nums[low] == nums[low-1])
                        low++;
                    while(high>low && nums[high] == nums[high+1])
                        high--;
                }
                else if(sum > 0){
                    high--;
                }
                else{
                    low++;
                }
            }
        }
        return res;
    }
};
