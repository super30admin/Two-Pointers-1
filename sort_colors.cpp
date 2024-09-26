/*
 * @Author: Yuvaraj Nagi
 * @Date: 2022-11-23 20:15:06
 * @Last Modified by: Yuvaraj Nagi
 * @Last Modified time: 2022-11-23 20:15:54
 * Time Complexity : O(n)
 * Space Complexity : O(1)
 */

class Solution
{
public:
    void sortColors(vector<int> &nums)
    {
        // red - 0
        // white - 1
        // blue - 2

        // using two pointers we will sort the given vector

        int low = 0;
        int mid = 0;
        int high = nums.size() - 1;

        while (mid <= high)
        {

            // start from low and compare with high, if the number is lesser than high then swap
            //  eg 2,0,2,1,1,0
            int temp;
            if (nums[mid] == 2)
            {
                temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;

                high--;
            }

            else if (nums[mid] == 0)
            {
                temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }

            else
            {
                mid++;
            }
        }
    }
};