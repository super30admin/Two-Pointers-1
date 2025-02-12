// Time Complexity: O(n^2)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes

// Approach:
// 1. We will sort the input array.
// 2. Iter through array and if i > 0 and nums[i] == nums[i - 1], we will continue.
// 3. We will use two pointers low = i + 1 and high = last index.
// 4. If sum of nums[i], nums[low] and nums[high] is less than 0, we will increment low.
// 5. If sum of nums[i], nums[low] and nums[high] is greater than 0, we will decrement high.
// 6. If sum of nums[i], nums[low] and nums[high] is equal to 0, we will add the triplet to result and increment low and decrement high.


class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> result;
        if(nums.size() < 3){return result;}

        sort(nums.begin(), nums.end());
        for(int i = 0; i < nums.size(); i++){
            if(i > 0 && nums[i] == nums[i - 1]){continue;}
            int low = i + 1; 
            int high = nums.size() - 1; 
            while(low < high){
                int sum = nums[i] + nums[low] + nums[high];
                if(sum < 0){
                    low++;
                }
                else if(sum > 0){
                    high--;
                }
                else{
                    result.push_back({nums[i], nums[low], nums[high]});
                    while(low < high && nums[low] == nums[low + 1]){low++;}
                    while(low < high && nums[high] == nums[high - 1]){high--;}
                    low++;
                    high--;
                }
            }
        }
        return result;
    }
};