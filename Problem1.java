// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
/*
 * Using 3 pointers
 * Low -- >0, high - 2, Mid ---- 1
 * 
 * If num[mid] == 0 swap mid and low and increment low and mid
 * if num[mid] == 2 swap mid and high decrement high
 * num[mid] == 1 increment mid
 */

 class Solution {
    public void sortColors(int[] nums) {
      
        if(nums == null || nums.length == 0) return;
       int n = nums.length;
       int low = 0;
       int mid = 0;
       int high = n-1;
       while(mid <= high)
       {
           if(nums[mid] == 0)
           {
               swap(nums,low,mid);
               low++;
               mid++;
           }
           else if(nums[mid] == 2)
           {   
               swap(nums,high,mid);
               high--;
           }else{
               mid++;
           }
       }

    }

    private void swap(int [] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp; 
    }
}