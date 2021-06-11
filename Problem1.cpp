// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Sorting Colors

#include<iostream>
#include<vector>

using namespace std;

class Solution {
public:
    void sortColors(vector<int>& nums) {
        
        // Brute force will be a normal sort
        // Linear time will be two pointers 
        
        if(nums.size() == 1)
            return;
        
        //Set pointer locations
        int low = 0;
        int mid = 0;
        int high = nums.size() - 1;
        
        while(mid <= high){
            
            if(nums[mid] == 0){
                swap(nums[low], nums[mid]);
                low++;
                mid++;
            }
            
            else if(nums[mid] == 2){
                swap(nums[mid], nums[high]);
                    high--;
            }
            else {
                mid++;
            }
        }
        
    }
};