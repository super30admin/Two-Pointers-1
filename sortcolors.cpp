//Time complexity : O(n)
//Space complexity : O(1)
//Leetcode : Yes
//Approach :
            // Keep three pointers each one for each color
            // Swap each color with its pointer accordingly

class Solution {
public:
    void sortColors(vector<int>& nums) {
        if(nums.size() == 0)
            return;
        
        int low = 0;
        int mid = 0;
        int high = nums.size() - 1;
        
        while(mid <= high)
        {
            if(nums[mid] == 0)
            {
                swap(nums[mid],nums[low]);
                mid++;
                low++;
            }
            else if(nums[mid] == 2)
            {
                swap(nums[mid], nums[high]);
                high--;
            }
            else
            {
                mid++;
            }
        }
    }
};