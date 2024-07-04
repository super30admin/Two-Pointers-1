/*
 *                  3 Sum
 *
 * Leetcode : https://leetcode.com/problems/3sum/description/
 * 
 * Time complexity and Space complexity :
 * Time complexity is O(n^2) and space complexity is O(1), considering the sorting operation is O(n log n) but dominated 
 * by the O(n^2) complexity of the three-pointer approach.
 * 
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : -
 * Your code here along with comments explaining your approach in three sentences only
 *          - Sort the array and use a three-pointer technique to find unique triplets that sum to zero.
 */
#include <iostream>
#include <vector>
#include <algorithm> // For sort function
using namespace std;

class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> result;
        int n = nums.size();
        sort(nums.begin(), nums.end()); // Ascending order

        // Two pointers
        for(int i = 0; i < n - 2; i++) {
            // Outside duplicates
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            // Two pointers
            int l = i + 1;
            int r = n - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];

                if (sum == 0) {
                    result.push_back({nums[i], nums[l], nums[r]});
                    l++;
                    r--;
                    while(l < r && nums[l] == nums[l-1]) {
                        l++;
                    } 
                    while(l < r && nums[r] == nums[r+1]) {
                        r--;
                    } 
                } else if (sum > 0) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return result;
    }
};

int main() {
    Solution solution;
    vector<int> nums = {-1, 0, 1, 2, -1, -4}; // Example vector of numbers
    vector<vector<int>> result = solution.threeSum(nums);

    cout << "Triplets that sum to zero are:" << endl;
    for (const auto& triplet : result) {
        cout << "[";
        for (size_t i = 0; i < triplet.size(); i++) {
            cout << triplet[i];
            if (i < triplet.size() - 1) {
                cout << ", ";
            }
        }
        cout << "]" << endl;
    }

    return 0;
}
