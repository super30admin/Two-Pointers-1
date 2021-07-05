// Approach:
// 1: Here we keep track of zero and two index in one pass of loop
// 2: A flag is maintained to keep track of 1's while swapning
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
class Solution {
    public void sortColors(int[] nums) {
        //  s       e           
        // [2,0,2,1,1,2]
        int start = 0, end = nums.length - 1;
        int i = 0;
        boolean flag= false;
        
        while(i<=end && i<nums.length){
            flag = false;
            if(nums[i]==0){
                if(i > start){
                    swap(nums, i, start);
                    flag = true;
                    start++;
                }
                else {
                    start++;
                }
            }
            else if(nums[i]==2){
                swap(nums, i, end);
                flag=true;
                end--;
            }
            if(!flag)
                i++;
        }
    }
    
    public void swap(int[] nums, int i, int j) {
        if(i != j){
            nums[i] = nums[i] + nums[j];
            nums[j] = nums[i] - nums[j];
            nums[i] = nums[i] - nums[j];
        }
    }
    
}