// Time Complexity : O(N)

// Space Complexity : O(1)

// Did this code successfully run on Leetcode : YES

// Appoarch: Using the three pointers, low, mid and high. Made use of high and low
// to keep swapping nums and mid to be moving across the array.


#include <bits/stdc++.h>
using namespace std;

class Solution {
public:
    void sortColors(vector<int>& nums) {
        int n = nums.size();
        int l = 0;
        int mid = 0;
        int h = n-1;
        while(mid<=h){
            if(nums[mid] == 0){
                swap(nums[mid],nums[l]);
                l++;
                mid++;
            }
            else if(nums[mid] == 2){
                swap(nums[mid],nums[h]);
                h--;
            }
            else{
                mid++;
            }
        }
    }
};