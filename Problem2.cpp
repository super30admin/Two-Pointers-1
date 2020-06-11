// Time Complexity : O(n*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        int n = nums.size();
        sort(nums.begin(), nums.end());
        vector<vector<int>> res;
        if(n==0) return res;
        
        for(int i=0; i<n-2; i++){
            //handling duplicates on i indices/outermost loop
            if(i>0 && nums[i]==nums[i-1])
                continue;
            if(nums[i]>0) break;
            
            int low = i+1;
            int high = n-1;
            while(low<high){
                int sum = nums[i]+nums[low]+nums[high];
                if(sum==0){
                    vector<int> temp;
                    temp.push_back(nums[i]);
                    temp.push_back(nums[low]);
                    temp.push_back(nums[high]);
                    res.push_back(temp);
                    low++;
                    high--;
                    
                    //handling duplicate numbers between high and low
                    while(low<high && nums[low]==nums[low-1]) low++;
                    while(low <high && nums[high]==nums[high+1]) high--;
                    
                   
                }
                else if(sum>0){
                    high--;
                }
                else if(sum<0){
                    low++;
                }
            }     
        }
        
        return res;
    }
};
