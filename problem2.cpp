// Time Complexity : nlogn + n*n => O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
// firstly, we need to sort the array.
// we run outerloop for each element and then use two pointers in the loop and proceed accordingly.
// edge cases are: we need to eliminate duplicates, we do this by checking same values and increment or decrement pointers.
// we increment outer loop as well if we find duplicates.




class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        if(nums.empty() || nums.size()<3){
            return {};
        }
        sort(nums.begin(),nums.end());
        vector<vector<int>>result;
        for(int i = 0;i<nums.size();i++)
        {
            if(i!=0 && nums[i]==nums[i-1])
            {
                continue;
            }
            int lo = i+1;
            int hi = nums.size()-1;
            while(lo<hi)
            {
                if(nums[i]>0) return result;
                int p = nums[i] + nums[lo] + nums[hi];
                if(p==0)
                {
                    result.push_back({nums[i], nums[lo], nums[hi]});
                    lo++;
                    hi--;
                    while(lo<hi && (nums[lo] == nums[lo-1]))
                    {
                        lo++;
                    }
                    while(lo<hi && (nums[hi] == nums[hi+1]))
                    {
                        hi--;
                    }
                }
                else if(p<0)
                {
                    lo++;
                }
                else
                {
                    hi--;
                }

            }
        }
        return result;
    }
};