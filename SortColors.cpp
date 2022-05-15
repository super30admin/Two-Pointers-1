// Time Complexity :  O(n) where n = size of input 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

// Three line explanation of solution in plain english
/* Use three pointers for three colors, low, mid and high. 
 * Initialize low and mid pointer to start of array and high to end of array.
 * Perform the following operations till mid does not cross high pointer.
 *  A) If element pointed by mid is 0 then swap mid and low pointer elements and increment mid and low.
 *  B) If element pointed by mid is 2 then swap mid and high pointer elements and decrement the high pointer.
 *  C) Else, increment mid pointer. 
 */

class Solution {
public:
    void sortColors(vector<int>& nums) {
        
        if (nums.size() == 0)
            return;
        
        int n = nums.size();
        int low = 0, mid = 0;
        int high = n - 1;
        
        while (mid <= high)
        {
            if (nums[mid] == 0)
            {
                swap(nums[mid], nums[low]);
                low++;
                mid++;
            }
            else if (nums[mid] == 2)
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