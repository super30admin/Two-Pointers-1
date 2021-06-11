// Time Complexity : O(n^2 + n log n) -> O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// 3 Sum

#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        
        if(nums.empty())
            return vector<vector<int>>();
        
        vector<vector<int>> result;
        vector<int>temp;
        
        sort(nums.begin(), nums.end()); // sort the array
        
        for(int i = 0; i < nums.size(); i++){
            
            if(i != 0 && nums[i] == nums[i -1]) // outer duplicate check
                continue;
            
            int left = i + 1;   // beginning after the pivot
            int right = nums.size() - 1;    //end of array
            
            while(left < right){
                
                if(nums[i] + nums[left] + nums[right] < 0){     // head towards left
                    left++;
                }
                else if(nums[i] + nums[left] + nums[right] > 0){
                    right--;
                }
                else{
                    temp.push_back(nums[i]);
                    temp.push_back(nums[left]);
                    temp.push_back(nums[right]);
                    result.push_back(temp);
                    temp.clear(); // refresh your temp array for new pair
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left-1])       //  inner duplicate checks 
                        left++;
                    while(left < right && nums[right] == nums[right+1])
                        right--;
                }
            }
            
        }
        
        return result;
    }
};
