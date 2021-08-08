// Time Complexity : O(N^2) where N is the size of the array
// Space Complexity : O(N) as I am using a map to find whether that triplet is already found or not
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope
// Problem Link: https://leetcode.com/problems/3sum/
// Submission Link: https://leetcode.com/submissions/detail/534484010/

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> answer;
        map<pair<pair<int, int>,int>, bool> triplet_found;
        sort(nums.begin(), nums.end());
        for(int i = 0; i < nums.size(); i++){
            int fixed = i;
            int low = i+1;
            int high = nums.size() - 1;
            
            if(nums[fixed] > 0)
                return answer;
            
            while(low < high){
                if(nums[low] + nums[fixed] + nums[high] == 0 && triplet_found[make_pair(make_pair(nums[low], nums[fixed]), nums[high])] == false){
                    triplet_found[make_pair(make_pair(nums[low], nums[fixed]), nums[high])] = true;
                    answer.push_back({nums[low], nums[fixed], nums[high]});
                    low++;
                    high--;
                }
                else if(nums[low] + nums[fixed] + nums[high] < 0)
                    low++;
                else
                    high--;
            }
        }
        return answer;
    }
};