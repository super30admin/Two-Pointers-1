/*
 ? Problem: Sort Colors
 * Time Complexity : O(n)
 * Space Complexity : O(1)
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : No
*/

#include <vector>

class Solution {
public:
    void sortColors(std::vector<int>& nums) {
        int l = 0, m = 0, r = nums.size() - 1;

        while (m <= r) {
            if (nums[m] == 0) {
                std::swap(nums[m], nums[l]);
                l++;
                m++;
            } else if (nums[m] == 2) {
                std::swap(nums[m], nums[r]);
                r--;
            } else {
                m++;
            }
        }
    }
};