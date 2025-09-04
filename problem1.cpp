// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// We use a low pointer to keep track of 0s, mid to keep track of 1s and high to keep track of 2s
// Everytime we encounter a 2, we swap nums[mid] and nums[high] and decrement high
// When we encounter a 0, we swap nums[mid] and nums[low] and increment both, if we get a 1, we just increment mid

class Solution {
public:
    void sortColors(vector<int>& nums) {
        int low = 0;
        int mid = 0;
        int high = nums.size() - 1;
        while(mid <= high) {
            if(nums[mid] == 1) {
                mid++;
            } else if(nums[mid] == 2) {
                swap(nums[mid], nums[high]);
                high--;
            } else {
                swap(nums[mid], nums[low]);
                mid++;
                low++;
            }
        }
    }
};