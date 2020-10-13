// Time Complexity :O(n) - will go through entire array once
// Space Complexity :O(1) - moving in place
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
class Solution {
    /** We use 3 pointers - one left pointer to manage 0s,
     one right pointer to manage twos, and one current pointer to manage 1s.
     When current pointer encounters a 0 we have to swap it with left pointer,
     If we encounter a 1 we just move along, and if we encounter a 2
      we swap it with right pointer.
      **/
    public void sortColors(int[] nums) {

        int zeroPointer = 0;
        int onePointer = 0;
        int twoPointer = nums.length-1;

        while(onePointer<=twoPointer){

            if(nums[onePointer]==0){
                nums=swap(nums, zeroPointer, onePointer);
                zeroPointer++;
                 onePointer++;
            }else if(nums[onePointer]==1){
                onePointer++;
            }else{
                 nums=swap(nums, twoPointer, onePointer);
                 twoPointer--;
            }

        }

    }

    public int[] swap(int[] nums,int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
        return nums;
    }
}