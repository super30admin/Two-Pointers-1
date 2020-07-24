// Time Complexity : O(N) where N=Number of elements in array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
//It is implemented using 2 pointer technique.

class Solution {
public:
    void sortColors(vector<int>& nums) {
        int low=0,mid=0,high=nums.size()-1;
        
        while(mid<=high)
        {
            if(nums[mid] == 2)
            {
                swap(nums[mid],nums[high]);
                high--;
            }
            else if(nums[mid] == 1)
            {
                mid++;
            }
            else
            {
                swap(nums[low],nums[mid]);
                low++;
                mid++;
            }
        }
    }
    void swap(int &a,int &b){
        int temp;
        temp =a;
        a = b;
        b = temp;
        
    }
};
