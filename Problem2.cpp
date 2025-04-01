// Time Complexity : O(N)+O(NlogN) N is size of array
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes


// Your code here along with comments explaining your approach:
// 1. Traverse from first to last and each traversal take 2 pointers similar to 2 sum.

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int n=nums.size();
        set<vector<int>> ans;
        for(int i=0;i<n-2;i++){
            int a=i+1;
            int b=n-1;
            while(a<b){
                if(nums[b]+nums[a]+nums[i]==0){
                    vector<int> tm;
                    tm.push_back(nums[i]);
                    tm.push_back(nums[a]);
                    tm.push_back(nums[b]);
                    ans.insert(tm);
                    a++;b--;
                }
                else if(nums[b]+nums[a]+nums[i]<0){
                    a++;
                }
                else{
                    b--;
                }
            }
        }
        vector<vector<int>> an;
        for (auto itr : ans)
        {
           an.push_back(itr);
        } 
        return an;
    }
};