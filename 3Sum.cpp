// Time Complexity: O(n^2)
// Space Complexity: O(1) (auxiliary Space)

class Solution {
public:
    vector<vector<int>> result; 
    vector<vector<int>> threeSum(vector<int>& nums) {
        int i = 0; 
        sort(nums.begin(), nums.end());
        while(i < nums.size()) { 
            int targetSum = 0 - nums[i];
            // Write Two Sum here: 
            int ptr1 = i+1; 
            int ptr2 = nums.size()-1; 
            while(ptr1 < nums.size() && ptr2 >= 0 && ptr1 < ptr2) {
                if(nums[ptr1] + nums[ptr2] == targetSum) {
                    result.push_back({nums[i], nums[ptr1], nums[ptr2]});
                    ptr1++; 
                    ptr2--; 
                    while(ptr1 < nums.size() && nums[ptr1] == nums[ptr1-1]) ptr1++; 
                    while(ptr2 >= 0 && nums[ptr2] == nums[ptr2+1]) ptr2--; 
                } else if(nums[ptr1] + nums[ptr2] < targetSum) {
                    ptr1++;
                    while(ptr1 < nums.size() && nums[ptr1] == nums[ptr1-1]) ptr1++;  
                } else {
                    ptr2--; 
                    while(ptr2 >= 0 && nums[ptr2] == nums[ptr2+1]) ptr2--; 
                }
            }

            i++; 
            while(i < nums.size() && nums[i] == nums[i-1]) i++; 
            

            
        }

        return result; 
    }

};