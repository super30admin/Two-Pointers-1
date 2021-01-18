// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;
        //if(nums.length == 1) return nums;
        int h = nums.length - 1;
        int l = 0;
        int mid = 0;
        //loop until mid is greater than high then we know the array is sorted
        while(mid <= h){
            //check the mid casse if it is 1 then we know our array is sorted because we want 1 i the middle
            if(nums[mid] == 1) mid++;
            //if mid is equal to 2 we want to push mid to the high pointer
            else if(nums[mid] == 2){ 
               nums = swap(nums,mid,h); 
                h--; 
            }
            //if mid is equal to 0 we want to push 0 towards the low pointer
            else{
                nums = swap(nums,mid,l); 
                mid++; 
                l++;

            } 
        }
        //return nums;
    }
    private int [] swap(int[] nums, int mid, int pointer){
        int temp = nums[mid];
        nums[mid] = nums[pointer];
        nums[pointer] = temp;
        return nums;
    }
}