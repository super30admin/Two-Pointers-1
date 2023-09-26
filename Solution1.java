//Leetcode Problem : https://leetcode.com/problems/sort-colors/
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * I set low and mid to 0 and high to nums.length-1. I traverse until mid<=high. If nums[mid] == 0, I swap low with mid and
 * increment both low and mid. If nums[mid]==1, I simply increment mid. If nums[mid]==2, I swap mid with high and decrement high.
 */

class Solution {
    public void sortColors(int[] nums) {
        int low = 0, high = nums.length-1,mid=0;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else
            {
                swap(nums,mid,high);
                high--;
            }
        }
    }

    public void swap(int []nums, int i, int j)
    {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}