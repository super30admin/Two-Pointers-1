// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
// In this approach we use three pointers , l , m and h. L is used for 0s , m for 1s and h for 2s.
// Whenever we see a 2 , we try to move it to the end of the array and move the pointer toward the mid. When we see a 0 , we try to move it to
// the beginning of the array and move the mid and left towards the middle of the array. Mid pointer is all we use to comapre elements and 
// we try pushing it to the middle of the array until it becomes less than or equal to high that's when the array would be sorted.
class Solution {
    public void sortColors(int[] nums) {
      
      int l = 0;
      int m = 0;
      int h = nums.length-1;
      
      while(m<=h)
      {
        if(nums[m]==2)
        {
          int temp = nums[h];
          nums[h] = nums[m];
          nums[m] = temp;
          h--;
        }
        else if(nums[m]==0)
        {
          int temp = nums[m];
          nums[m] = nums[l];
          nums[l] = temp;
          l++;
          m++;
        }
        else
        {
          m++;
        }
      }
      
        
    }
}