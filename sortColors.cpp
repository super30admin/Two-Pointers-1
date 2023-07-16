// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
#include<iostream>
#include <vector>

using namespace std;

class Solution {
public:
    void sortColors(vector<int>& nums) {

        int left=0;
        int right = nums.size()-1;

        for(int i=0;i<=right;i++){
            

            if(nums[i]==0){
                swap(nums[left],nums[i]);
                left++;

            }


            if(nums[i]==2){
                swap(nums[right],nums[i]);
                right--;
                i--;

            }
            
        }


        
        
    }
};