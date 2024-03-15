// Time Complexity : O(n)             
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

/*
Leet code : https://leetcode.com/problems/3sum/

Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] 
such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
Notice that the solution set must not contain duplicate triplets.
*/

/*
Approach 1 : using brute force method
Time Complexity  : O(n^3)
Space Complexity : O(1) 
This method does not provide unique numbers.
*/

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>>result;

        for(int i=0; i<nums.size()-3; i++){
            for(int j=1; j<nums.size()-2; j++){
                for(int k=2; k<nums.size()-1; k++){
                    if(nums[i]+nums[j]+nums[k] == 0){
                        vector<int>temp{nums[i], nums[j], nums[k]};
                            result.push_back(temp);
                    }
                }
            }
        }
        return result;
    }
};


/*
Approach 2 : using extension of two sum : using hashset
Time Complexity  : O(n^2)
Space Complexity : O(n)   ..... because of use of hashset 
This method does not provide unique numbers.
Need to implement seperate logic to remove duplicate number in result.
*/

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>>result;
        
        for(int i=0; i<nums.size()-3; i++){
            int twoSum = 0-nums[i];
            unordered_set<int>hSet;

            for(int j=i+1; j<nums.size()-1; j++){
                int target = twoSum - nums[j];
                if (hSet.find(target) != hSet.end()) {
                    result.push_back({nums[i], nums[j], target});
                } else {
                    hSet.insert(nums[j]);
                }
            }
        }
        return result;
    }
};



/*
Approach 3 : using pointer method
Time Complexity  : O(n^2) + nlogn == O(n^2)
Space Complexity : O(1) 
This method does not provide unique numbers.
Need to implement seperate logic to remove duplicate number in result.
*/


class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>>result;

        sort(nums.begin(), nums.end());    // nLogn
        for(int i = 0; i<= nums.size()-3; i++){
            if(i!=0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = nums.size()-1;

            while(left < right){
                int sum = nums[i] + nums[left] + nums[right];
                if(sum == 0){
                    result.push_back({nums[i], nums[left], nums[right]});
                    while(left < right && (nums[left] == nums[left+1])){
                        left++;
                    }
                    while(left < right && (nums[right] == nums[right-1])){
                        right--;
                    }
                    left++;
                    right--;
                } else if (sum < 0){
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
};