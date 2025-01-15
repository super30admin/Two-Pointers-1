// Time Complexity : O(log n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
class Solution
{
public:
    void sortColors(vector<int> &nums)
    {
        int n = nums.size();
        int left = 0, right = n - 1, mid = left;

        // swap elements to sort the elements in expected fashion
        // performing 2 pointer technique
        while (mid <= right)
        {
            if (nums[mid] == 2)
            {
                swapNum(nums, mid, right);
                right--;
            }
            else if (nums[mid] == 0)
            {
                swapNum(nums, left, mid);
                left++;
                mid++;
            }
            else
            {
                mid++;
            }
        }
    }

    void swapNum(vector<int> &nums, int first, int second)
    {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
};