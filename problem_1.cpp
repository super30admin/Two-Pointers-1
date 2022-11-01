/ Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    void sortColors(vector<int>& nums) {
        int l = 0;
        int m = 0;
        int h = nums.size() - 1;
        
        while (m <= h) {
            
            if(nums[m] == 1) m++;
            else if (nums[m] == 0) {
                swap(nums[l], nums[m]);
                l++;
                m++;
            } else {
                swap(nums[m], nums[h]);
                h--;
            }
        }
        
    }
};
