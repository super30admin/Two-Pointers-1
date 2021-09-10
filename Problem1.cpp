// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YEs
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    void sortColors(vector<int>& nums) {
        int mid = 0, low = 0, high = nums.size() -1;  // take 3 ptrs mid, low & high
       while(mid<=high) 
        {
            if(nums[mid] == 0){
                swap(nums[low], nums[mid]); // swap low and mid
                low++; mid++;
            }
            else if(nums[mid] == 2){
                swap(nums[high], nums[mid]); // swap high and mid
                high--;
            }
           else{
               mid++;
           }
        }
    }
    
   
};