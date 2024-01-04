// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
// Idea here is we use three pointers to track 0, 1, 2 colors. we use low to track 0, mid to track 1
// and high to track 2. If mid is 0 or 2 we swap those values such a way that all 0s are at the left
// end and all 2s are at the right end.
#include<vector>

class Solution {
public:
    // Helper to swap elements.
    void swap(std::vector<int>& nums, int i, int j)
    {
        int temp;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        return;
    }
    void sortColors(std::vector<int>& nums) {
        int low = 0;
        int mid = 0;
        int high = nums.size()-1;

        while(mid <= high)
        {
            // We use low to track 0s, mid to track 1s, high to track 2's
            if(nums[mid] == 0) // if element is 0, move it to beginning
            {
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 2) // if element is 2, move it to the end
            {
                swap(nums, mid, high);
                high--;
            }
            else // if element is 1
            {
                mid++;
            }
        }

        return;
    }
};