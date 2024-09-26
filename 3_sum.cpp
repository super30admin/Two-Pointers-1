/*
 * @Author: Yuvaraj Nagi
 * @Date: 2022-11-23 20:12:56
 * @Last Modified by: Yuvaraj Nagi
 * @Last Modified time: 2022-11-23 20:13:28
 * Time complexity : O(n^2)
 * Space Complexity : O(1)
 */

#include <vector>
class Solution
{
public:
    vector<vector<int>> threeSum(vector<int> nums)
    {
        // Achieve 3 sum using 3 pointers

        vector<vector<int>> result;

        sort(nums.begin(), nums.end());
        for (int first = 0; first < nums.size(); first++)
        {
            if (nums[first] > 0)
                break;
            if (first > 0 && nums[first] == nums[first - 1])
                continue;
            int second = first + 1;
            int last = nums.size() - 1;
            while (second < last)
            {
                int sum = nums[first] + nums[second] + nums[last];
                if (sum == 0)
                {
                    vector<int> r = {nums[first], nums[second], nums[last]};
                    result.push_back(r);
                    second++;
                    last--;

                    while (second < last && nums[second] == nums[second - 1])
                    {
                        second++;
                    }

                    while (second < last && nums[last] == nums[last + 1])
                    {
                        last--;
                    }
                }
                else if (sum < 0)
                {
                    second++;
                }
                else
                {
                    last--;
                }
            }
        }

        return result;
    }
};