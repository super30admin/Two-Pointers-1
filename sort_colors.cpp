// Time Complexity : O(n)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this

class Solution {
public:
    
    void swap(vector<int>& nums, int a, int b)
    {
        int temp;
        
        temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    
    void sortColors(vector<int>& nums) {
        
        int low = 0;
        int mid = 0;
        int high = nums.size()-1;
        
        while(mid <= high)
        {   
            if(nums[mid] == 0)
            {
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else if(nums[mid] == 1)
            {
                mid++;
            }
            else
            {
                swap(nums, mid, high);
                high--;
            }
        }
        
    }
};