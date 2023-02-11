// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * I set low and mid to 0 and high pointer to nums.length-1. If nums[mid] equals to 2, I swap element at mid and high index and decrement high. Else if nums[mid] equals 0, I swap elements at
 * low and mid index and increment both low and mid. Else if element at mid is 1, I increment mid.
 */

class Solution1 {
    public void sortColors(int[] nums) {
        int low = 0,high = nums.length-1;
        int mid = 0;

        while(mid<=high)
        {
            if(nums[mid]==2)
            {
                swap(nums,mid,high);
                high--;
            }
            else if(nums[mid]==0)
            {
                swap(nums,low,mid);
                mid++;
                low++;
            }
            else
            {
                mid++;
            }
        }
    }

    public void swap(int []nums,int i,int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}