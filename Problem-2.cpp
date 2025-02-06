// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Iterate through the array, for each element, perform two pointer approach
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        int n = nums.size();
        sort(nums.begin(), nums.end());
        vector<vector<int>> ans;
        if(nums[0] > 0) return ans;
        for(int i=0; i<n-2; i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j=i+1; int k = n-1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0){
                    ans.push_back({nums[i], nums[j], nums[k]});
                    j++; 
                    k--;
                    while(j<k && nums[j] == nums[j-1]) j++;
                    while(j<k && nums[k] == nums[k+1]) k--;
                    
                }
                else if(sum < 0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return ans;
    }
};