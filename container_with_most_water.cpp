/*
 *                  Container with most water
 *
 * Leetcode : https://leetcode.com/problems/container-with-most-water/description/
 * 
 * Time complexity : O(N)
 *
 * Space complexity : O(1) 
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : -
 * Your code here along with comments explaining your approach in three sentences only
 *          - Two pointers move inward from both ends of the height vector, 
 * calculating areas and updating the maximum area until they meet.
 * 
 */
#include<iostream>
#include<vector>

using namespace std;
class Solution {
public:
    int maxArea(vector<int>& height) {
        int maxi = INT_MIN;

        int n = height.size();

        int left = 0;
        int right = n - 1;
        
        while(left < right) {
            int currArr = (right-left) * min(height[left], height[right]);
            maxi = max(maxi, currArr);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxi;
    }
};

int main() {
    Solution solution;
    vector<int> height = {1, 8, 6, 2, 5, 4, 8, 3, 7};  // Example vector of heights
    int result = solution.maxArea(height);
    cout << "The maximum area is: " << result << endl;
    return 0;
}