Problem 75- sort colors
// Time Complexity :O(n)
// Space Complexity :constant
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
  
  class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high= nums.length-1;
        while(mid<=high)
        {
            if(nums[mid]==2)
            {
                int num;
                num=nums[high];
                nums[high]=nums[mid]; 
                nums[mid]=num;
                high--;

            }
            else if(nums[mid]==0)
            {
                int dnum;

                dnum=nums[low];
                nums[low]=nums[mid]; 
                nums[mid]=dnum;
                mid++;
                low++;
            }
            else
            {
                mid++;
            }
        }    
    }
}
