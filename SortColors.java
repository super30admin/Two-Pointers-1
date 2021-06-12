
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


class Solution {
    public void sortColors(int[] nums) {
        //edge case
      if(nums == null || nums.length == 0) return;

      //3 pointer left, right and mid
      int left = 0;
      int right = nums.length-1;
      int mid = 0;
      

      while(mid <= right) {
       //if the mid is zeo swap it with the number at the left pointer 
        if(nums[mid] == 0) {
          swap(nums,left,mid);
          left ++ ;
          mid++;
        } else if(nums[mid] == 2) {
          // if it two then swap it with the number at the right pointer 
          swap(nums,right, mid);
          right--;
        } else {
          mid++;
        }
      }
    }
  
  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }
}