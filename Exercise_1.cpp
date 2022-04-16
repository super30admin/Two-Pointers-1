// Time Complexity                              :  O(N)
// Space Complexity                             :  O(1)
// Did this code successfully run on Leetcode   :  Yes
// Any problem you faced while coding this      :  No

#include <bits/stdc++.h> 
using namespace std;  

// https://leetcode.com/problems/sort-colors/

class Solution {
public:
    void sortColors(vector<int>& nums) {
        int n = nums.size();
        if(n == 0) return;
        
        int l = 0, mid = 0, r = n-1;
        
        while(mid <= r) {
            if(nums[mid] == 0) {
                swap(nums[mid], nums[l]);
                l++;
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums[mid], nums[r]);
                r--;
            } else {
                mid++;
            }
        }
    }
};