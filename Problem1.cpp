// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach


class Solution {
public:
    void sortColors(vector<int>& nums) {
        int low = 0 , mid = 0, high = nums.size()-1;
        while(mid<=high)
        {
            if(nums[mid] == 0)
            {
                swap(nums[low] , nums[mid]);
                low++;
                mid++;
            }
            else if(nums[mid] == 1)
            {
                mid++;
            }
            else
            {
                swap(nums[mid] , nums[high]);
                high--;
            }
        }
 
    }
    };