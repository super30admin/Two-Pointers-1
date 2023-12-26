// Time Complexity : O(n)
// Space Complexity : O(1)
// Method used : Array Traversal

class Solution {
    public void sortColors(int[] nums) {
        
        int low, mid, high, temp;

        low = mid = 0;
        high = nums.length - 1;

        while(mid <= high)
        {
            if(nums[mid] == 0)
            {
                temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                
                ++low;
                ++mid;
            }

            else if(nums[mid] == 1) ++mid;

            else
            {
                temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                --high;
            }
        }
    }
}