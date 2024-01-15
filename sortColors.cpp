// Time Complexity : O(n) n is size of vector nums.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

#include <vector>
#include <iostream>
using namespace std;

class Solution {
public:
    void sortColors(vector<int>& nums) {
        //i will keep track of end of 0s
        int i = -1;
        //j will keep track of new element
        int j = 0;
        //k will keep track of first 2;
        int k = nums.size();
        while(j<k)
        {
            if(nums[j]==1)
            {
                j++;
            }
            else if(nums[j]==0)
            {
                swap(nums[i+1],nums[j]);
                i++;j++;
            }
            else
            {
                swap(nums[k-1],nums[j]);
                k--;
            }
        }
    }
};