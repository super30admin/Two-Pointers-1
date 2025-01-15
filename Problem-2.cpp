// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution
{
public:
    vector<vector<int>> threeSum(vector<int> &nums)
    {
        if (nums.empty() || nums.size() < 3)
        {
            return {};
        }
        // sort elements to find the expected sum of elements
        sort(nums.begin(), nums.end());
        int n = nums.size();
        vector<vector<int>> store;

        for (int i = 0; i < n; i++)
        {
            int l = i + 1, r = n - 1;

            // exit if the element is greater than the expected
            //  sum since moving right the sum will be greater than 0
            if (nums[i] > 0)
            {
                break;
            }

            while (l < r)
            {

                if (nums[i] + nums[l] + nums[r] == 0)
                {
                    vector<int> temp = {nums[i], nums[l], nums[r]};
                    store.push_back(temp);
                    l++;
                    r--;

                    // to avoid inserting duplicates
                    while (l < r && nums[l] == nums[l - 1])
                    {
                        l++;
                    }

                    // to avoid inserting duplicates
                    while (r > l && nums[r] == nums[r + 1])
                    {
                        r--;
                    }
                }
                else if (nums[i] + nums[l] + nums[r] < 0)
                {
                    l++;
                }
                else
                {
                    r--;
                }
            }
            // to avoid inserting duplicates
            while (i + 1 < n && nums[i] == nums[i + 1])
            {
                i++;
            }
        }

        return store;
    }
};