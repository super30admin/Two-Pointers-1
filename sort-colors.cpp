// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;


class Solution {
public:
    void sortColors(vector<int>& nums) {
        int low = 0;
        int mid = 0;
        int high = nums.size() - 1;

        while (mid <= high) {
            if (nums[mid] == 1)
                mid++;
            else if (nums[mid] == 0)
                swap(nums[low++], nums[mid++]);
            else
                swap(nums[mid], nums[high--]);
        }
    } 
};