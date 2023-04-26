// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

// using two pointer approach with 3 pointers

class Solution {
public:
    void sortColors(vector<int>& nums) {
        int n = nums.size();
        int lo = 0, mid = 0, hi = n - 1;
        for(int i = 0; i< n;i++)
        {
            if(nums[mid] == 2){
                swap(nums[mid],nums[hi]);
                hi--;
            }
            else if(nums[mid]==0){
                swap(nums[mid],nums[lo]);
                lo++;
                mid++;
            }
            else{
                mid++;
            }
        }
        
    }
};