// Author: Subhed Chavan
// Batch: December 24
// Problem Statement: 75: Sort Colors
// Approach: 2 Pointers
// Time Complexity: O(n)

class Solution
{
public:
    void sortColors(vector<int> &nums)
    {
        // Base Case
        if (nums.empty())
        {
            return;
        }

        int n = nums.size();

        int left = 0;
        int mid = 0;

        int right = n - 1;

        // Move with three pointers
        // Mid will be the pointer where element has to be placed
        // Case for while loop

        while (mid <= right)
        {

            // If Blue at mid, move it to right
            if (nums[mid] == 2)
            {
                swap(nums, mid, right);
                right--;
            }

            // If Red at mid, move it to left
            else if (nums[mid] == 0)
            {
                swap(nums, mid, left);
                left++;
                mid++;
            }

            // Increase the mid
            else
            {
                mid++;
            }
        }
    }

    // Function to swap
    void swap(vector<int> &nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
};