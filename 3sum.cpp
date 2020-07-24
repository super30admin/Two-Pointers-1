// Time Complexity : O(N*N) where N=Number of elements in array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> res;
        if(nums.size()==0 || nums.size()<3 ){
            return res;
        }
        sort(nums.begin(),nums.end());
        
        
        for(int i=0;i<nums.size()-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            // if(nums[i]>0)
            //     break;
            int start = i+1,end = nums.size()-1;
            while(start<end){
                int temp = nums[i]+nums[start]+nums[end];
                if(temp==0){
                    vector<int> restemp;
                    restemp.push_back(nums[i]);
                    restemp.push_back(nums[start]);
                    restemp.push_back(nums[end]);
                    res.push_back(restemp);
                    
                    while(start<end && nums[start]==nums[start+1]) start++;
                    while(start<end && nums[end]==nums[end-1]) end--;
                    start++;
                    end--;
                }
                else if(temp<0){
                    start = start+1;
                }
                else{
                    end = end -1;
                }
            }
            
        }
        return res;
        
    }
};
