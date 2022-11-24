/*
 * @Author: Yuvaraj Nagi
 * @Date: 2022-11-17 09:20:16
 * @Last Modified by: Yuvaraj Nagi
 * @Last Modified time: 2022-11-17 09:20:59
 * Time complexity : O(n)
 * Space omplexity : O(1)
 * Concept : 2 pointer
 */

class Solution
{
public:
    int maxArea(vector<int> &height)
    {
        // declare two pointers and solve

        int low = 0;
        int high = height.size() - 1;
        int maximum = 0;

        while (low < high)
        {

            maximum = max(maximum, min(height[low], height[high]) * (high - low));

            if (height[low] < height[high])
            {
                low++;
            }

            else
            {
                high--;
            }
        }

        return maximum;
    }
};