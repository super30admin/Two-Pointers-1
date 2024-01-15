// Time Complexity : O(nlogn + n^2) i.e. O(n^2) n is size of vector nums.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

class Solution {
private:
    void twoSum( vector<vector<int>> &result,vector<int>& nums,int F,int target,int start)
    {
        int sPtr = start;
        int ePtr = nums.size()-1;
        while(sPtr<ePtr)
        {
            if(nums[sPtr]+nums[ePtr]==target)
            {
                result.push_back({F,nums[sPtr],nums[ePtr]});
                sPtr++;
                ePtr--;
                while(sPtr>start && sPtr< ePtr && nums[sPtr]==nums[sPtr-1])
                {
                    sPtr++;
                }
                while(ePtr<nums.size()-1 && sPtr< ePtr && nums[ePtr]==nums[ePtr+1])
                {
                    ePtr--;
                }
            }
            else if(nums[sPtr]+nums[ePtr]<target)
            {
                sPtr++;
            }
            else
            {
                ePtr--;
            }
        }
    }
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        vector<vector<int>> result;
        for(auto e:nums)
            cout << e << " ";
        for(int i = 0;i<nums.size()-2;i++)
        {
            if(i>0 && nums[i-1]==nums[i])
                continue;
            if(nums[i]>0)
                break;
            twoSum(result,nums,nums[i],0-nums[i],i+1);
        }
        return result;
    }
};