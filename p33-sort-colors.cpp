// Time complexity is O(n)
// Space complexity is O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach:
/*
  low pointer - to keep track of zeros
  mid pointer - to keep track of ones
  high pointer - to keep track of twos
 
 When nums[mid] = 0, increment mid and high. Or else, add a separate if block below nums[mid] == 0.
*/

class Solution {
public:
    void sortColors(vector<int>& nums) {
        if(nums.size() == 1) return;
        int low = 0;
        int mid = 0;
        int high = nums.size()-1;
        
        while(mid <= high) {
            
            
            if(nums[mid] == 1)
                mid++;
            else if(nums[mid] == 2) {
                swap(nums[mid], nums[high]);
                high--;
            }
            else if(nums[mid] == 0) {
                swap(nums[mid], nums[low]);
                //mid++;
                low++;
            }
            
            if(mid < low)
                mid = low;
        }
    }
};
