75. Sort Colors
----------------------
Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.


// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :



class Solution {
public:

    void swap (vector<int>& nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    void sortColors(vector<int>& nums) {
        if (nums.size() == 0) {
            return;
        }
        int l = 0, h = nums.size()-1, m=0;

        while(m <= h) {
            if (nums[m] == 2) {
                swap(nums, m, h);
                h--;
            } else if (nums[m] == 0) {
                swap(nums, m, l);
                m++;
                l++;
            } else {
                m++;
            }
        }

    }
};
