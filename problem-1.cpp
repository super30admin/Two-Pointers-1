// 75. Sort colors
// Time Complexity : O(n)
// Space Complexity : 1
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
    
took three pointers: low, mid, and high, representing the positions where 0s, 
1s, and 2s should be placed respectively. iterates through the array
swapping elements accordingly such that all 0s are placed before 1s, and 
all 1s are placed before 2s, effectively sorting the array in place.

*/
 void sortColors(vector<int>& nums) {
        int low = 0, mid = 0, high = nums.size()-1;
        while(mid <= high)
        {
            if(nums[mid] == 2)
            {
                swap(nums[mid], nums[high]);
                high--;
            }
            else if(nums[mid] == 0)
            {
                swap(nums[low], nums[mid]);
                low++;
                mid++;
            }
            else
                mid++;
        }
        return;
    }