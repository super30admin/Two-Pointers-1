15. 3Sum

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

// Time Complexity : O(n^2) --> sorting = O(nlogn), looping = O(n), so O(nlogn + n^2) ==> O(n^2)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :



class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
       vector<vector<int>> result; 
        sort(nums.begin(), nums.end());
        int n = nums.size();
        for(int i=0; i< n-2; i++){
            //outside duplicacy
            if((i>0) && (nums[i]== nums[i-1])) {
                continue;
            }
            if(nums[i] >0) break;
            int low = i+1;
            int high = n-1;
            while(low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if(sum == 0) {
                   result.push_back({nums[i], nums[low], nums[high]});
                   low++;
                   high--;
                   //inside
                   while((low<high) &&(nums[low] == nums[low-1])) low++;
                   while((low<high) &&(nums[high] == nums[high+1])) high--;
                } else if (sum > 0) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return result;
    }
};


