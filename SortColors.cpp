// Time Complexity : O(N) where N is the size of the array
// Space Complexity : O(1) as I am not using any extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope
// Problem Link: https://leetcode.com/problems/sort-colors/
// Submission Link: https://leetcode.com/submissions/detail/535344526/

class Solution {
public:
    void sortColors(vector<int>& nums) {
        int low = 0, mid = 0, high = nums.size() - 1;
        
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums[low], nums[mid]);
                low++;
                mid++;
            }
            else if(nums[mid] == 2){
                swap(nums[high], nums[mid]);
                high--;
            }
            else
                mid++;
        }
    }
};