// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Use three pointers one to collect zeroes at the beginning and one to collect two at the end and Use
// a pointer to iterate from the starting if two found swap it with the two pointer and 
// decrement it, if one found just increment the pointer and if 0 found swap it with pointer 
// that collects zeroes and increment zero pointer and pointer used to iterate over the array.

class Solution {
    public void sortColors(int[] nums) {
        int zeroPointer = 0;
        int twoPointer = nums.length-1;
        int fastPointer = 0;
        while(fastPointer<=twoPointer){
            if(nums[fastPointer]==0){
                swap(fastPointer,zeroPointer,nums);
                zeroPointer++;
                fastPointer++;
                
            }
            else if(nums[fastPointer]==2){
                swap(fastPointer,twoPointer,nums);
                twoPointer--;
            }
            else{
                fastPointer++;
            }
        }
    }
    public void swap(int i,int j,int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}