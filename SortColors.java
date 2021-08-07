/* Time Complexity : O(n)
   Space Complexity :  O(1)
   Did this code successfully run on Leetcode : Yes
   Any problem you faced while coding this : No
   Method: Use three pointers and swap

*/

class Solution {
    public void sortColors(int[] nums) {
        int low=0,high=nums.length-1,mid=0;
        while(mid<=high)
        {
            if(nums[mid]==2)
            {
                swap(nums,mid,high);
                high--;
                
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else
            {
                swap(nums,low,mid);
                low++;
                mid++;
            }
        }
    }
    private void swap(int[] nums,int a,int b)
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}