/*
 *                  Sort Colors
 *
 * Leetcode : https://leetcode.com/problems/sort-colors/description/
 * 
 * Time complexity : O(N)
 * Space complexity : O(1)
 * 
 * 
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : -
 * Your code here along with comments explaining your approach in three sentences only
 *          - Use three pointers (left, mid, right) to partition the array into sections of 0s, 1s, and 2s by swapping elements as necessary.
 */
#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    void sortColors(vector<int>& nums) {
        int left = 0;
        int mid = 0;
        int right = nums.size() - 1;

        while (mid <= right) {
            if (nums[mid] == 0) {
                swap(nums[mid], nums[left]);
                left++;
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums[mid], nums[right]);
                right--;
            } else {
                mid++;
            }
        }
    }
};

int main() {
    Solution solution;
    vector<int> nums = {2, 0, 2, 1, 1, 0}; // Example vector of numbers
    solution.sortColors(nums);

    cout << "Sorted colors array:" << endl;
    for (const auto& num : nums) {
        cout << num << " ";
    }
    cout << endl;

    return 0;
}
