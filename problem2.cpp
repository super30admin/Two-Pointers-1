// Time Complexity : O(nlogn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int n = nums.size();
        int i=0,j=1;
        vector<vector<int>> ans;
        for(int i=0;i<n-2 && nums[i]<=0;i++)
        {
            for(int j=i+1;j<n-1 && nums[i]+nums[j]<=0;j++)
            {
                int sum = nums[i] + nums[j];
                bool found = binary_search(nums.begin()+j+1,nums.end(),-sum);
                if(found)
                {
                    
                    ans.push_back({nums[i],nums[j],-sum});
                    j = upper_bound(nums.begin()+j,nums.end(),nums[j])-nums.begin() - 1;
                    cout<<j<<'\n';
                    
                }
            }
            i = upper_bound(nums.begin()+i,nums.end(),nums[i]) - nums.begin() - 1;
        }
        
        return ans;
    }
};