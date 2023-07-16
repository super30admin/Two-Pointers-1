// Time Complexity :O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
#include<iostream>
#include <vector>

using namespace std;


class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {

        vector<vector<int>> result;

        
        

        sort(nums.begin(),nums.end());

        for(int i=0;i<nums.size()-1;i++){
            int left = i+1;
            int right = nums.size()-1;

            if(i>0 && nums[i]==nums[i-1]){
                continue;

            }

            while(left<right)
            {

                int threeSum = nums[i]+nums[left]+nums[right];
                
                

                if(threeSum>0){
                    right--;
                }

                else if(threeSum<0){
                    left++;
                }

                else{
                    result.push_back({nums[i],nums[left],nums[right]});
                    left++;
                    while(nums[left]==nums[left-1] && left < right){

                        left++;

                    }

                }
            
            
            }


            

        }


        return result;
        
    }
};