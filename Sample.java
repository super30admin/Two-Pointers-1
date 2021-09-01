// Time Complexity :o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : yes did not identify we need 2 pointers


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        if(nums.length==0 || nums.length==1) return;
        int start=0;
        int end=nums.length-1;  //taking 2 pointers to solve this approach.
        int current=0;
        while(start<end && current<=end) //making sure we are in boundaries amd array does not go over board
        {
        if(nums[current]==0) //check if the current value is 0 else swap with the start boundary
        {
            nums[current]=nums[start];
            nums[start]=0;
            current++;
            start++;
        }
        else if(nums[current]==2) //check if we get element is 2 so that we swap it with the last element
        {
            nums[current]=nums[end];
            nums[end]=2;
            end--;
        }
            else{ // this is the case where you get 1. In this case,just iterate the current
                current++;
            }
        }
    }
}