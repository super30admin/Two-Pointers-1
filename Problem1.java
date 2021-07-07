// Time Complexity : O(n) where n is number of elements in nums array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
// Low will be pointer to 0, mid will be pointer to 1 and high will be pointer to 2. I will compare mid with low and mid with high. If mid ==0, which is not correct position. I will swap the mid position 0 with low and increment low and mid. If mid==2, which is also incorrect, in this case I will swap mid position 2 with high and decrement only high. mid will not change here because 2 at mid can swap 0 at high which should be swapped with low in the next step. If mid==1, it is the correct position for mid so I will just increment the mid pointer.


class Solution {
    public void sortColors(int[] nums) {
      //Edge Case
      if(nums == null || nums.length==0){
            return;
        }
      //Logic
        int n = nums.length;
        int low=0,mid=0;
        int high = n-1;
      //traverse until mid crosses the high which will mean all the 0s and 1s are done.
        while(mid<=high){
            if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==0){
                swap(nums,low,mid);
                mid++;
                low++;
            }
            else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
        }
    }
  //swap the elements 
    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
