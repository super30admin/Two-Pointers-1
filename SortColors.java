// Time Complexity : O(n)
// Space Complexity : O(1) , no extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//take 2 pointers other than the current one to point at the start(left,to keep track of last 0 plus 1) and the last index (right, last 2, minus 1)
//if curr is 0, increment the left and right as it is in the right place, swap (left and curr)
//if it is 0, just increment curr
//if it is 2, swap the curr and right as 2 needs to be at the end, decrement right.

class Solution {
    public void sortColors(int[] nums) {
        if(nums==null||nums.length==0){
            return;
        }
        int left=0, right=nums.length-1, curr=0;
        
        while(curr<=right) {
            if(nums[curr]==0){
               swap(nums,curr,left);
                curr++;
                left++;
            }
            else if(nums[curr]==1){
                curr++;
            }
            else{
                swap(nums,curr,right);
                right--;
            }
        }
    }
    private static void swap(int[] nums,int curr, int right){
        int temp=nums[curr];
        nums[curr]=nums[right];
        nums[right]=temp;
    }
}