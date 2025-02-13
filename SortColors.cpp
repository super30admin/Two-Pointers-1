// Time Complexity : O(n)
// Space Complexity : O(log(n)) for sorting
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
#include <iostream>
#include <vector>

using namespace std;

class Solution {
public:
    void sortColors(vector<int>& nums) {
        int curr = 0;
        int p0 = 0;
        int p2 = nums.size()-1;
        while (curr<=p2) {
            if (nums[curr] == 0){
                swap(nums[curr++], nums[p0++]);
            }
            else if (nums[curr] == 2) {
                swap(nums[curr], nums[p2--]);
            }
            else curr++;
        }
    }
};