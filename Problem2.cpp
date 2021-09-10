// Time Complexity : O(n^2 logn)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Minor issues


// Your code here along with comments explaining your approach

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> result;
        if(nums.size() == 0 || nums.size() <3) return result;
        sort(nums.begin(), nums.end());  // sort the array
        
        for(int i = 0; i<nums.size(); i++)
        {
            if(i>0 && nums[i] == nums[i-1]) continue;  // outside duplicates
            if(nums[i] > 0) break;
            int low = i+1, high = nums.size() -1;  // essentially fix outside element and 2ptr rest of array
            while(low<high){
                
                if(nums[i] + nums[low] + nums[high] == 0 ) // if target found
                {
                    result.push_back({nums[i], nums[low], nums[high]}); // push in result
                    low++;
                    while(nums[low]==nums[low-1] && low<high) low++; // take care of duplicates
                    high--;
                    while(nums[high] == nums[high+1] && low<high) high--;

                }
                else if(nums[i] + nums[low] + nums[high] > 0){
                    high--;
                    while(nums[high] == nums[high+1] && low<high) high--; // take care of duplicates
                }
                else{
                    low++;
                    while(nums[low]==nums[low-1] && low<high) low++; // take care of duplicates
                }
                
                
            }
            
            
        }
        return result;
    }
};