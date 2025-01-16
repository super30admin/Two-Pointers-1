// Author: Subhed Chavan
// Batch: December 24
// Problem Statement: 15: 3Sum
// Approach: 2 Pointers
// Time Complexity: O(n^2)

class Solution
{
public:
    vector<vector<int>> threeSum(vector<int> &nums)
    {
        vector<vector<int>> result;

        // Base Case
        if (nums.size() < 3)
        {
            return result;
        }

        // Sort the array
        sort(nums.begin(), nums.end());

        int n = nums.size();

        for (int i = 0; i < n; i++)
        {

            // Skip duplicates
            if (i > 0 && nums[i] == nums[i - 1])
            {
                continue;
            }

            // If the current number is greater than 0, no triplet can sum to 0.
            if (nums[i] > 0)
            {
                break;
            }

            int left = i + 1;
            int right = n - 1;

            // Find pairs that sum with nums[i] to 0.
            while (left < right)
            {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0)
                {

                    // Add the three numbers to vector, if the sum is 0
                    result.push_back({nums[i], nums[left], nums[right]});
                    left++;
                    right--;

                    // Skip duplicates for the left pointer.
                    while (left < right && nums[left] == nums[left - 1])
                    {
                        left++;
                    }

                    // Skip duplicates for the right pointer.
                    while (left < right && nums[right] == nums[right + 1])
                    {
                        right--;
                    }
                }

                // Move right pointer leftward for a smaller sum.
                else if (sum > 0)
                {
                    right--;
                }

                // Move left pointer rightward for a larger sum.
                else
                {
                    left++;
                }
            }
        }

        return result;
    }
};
