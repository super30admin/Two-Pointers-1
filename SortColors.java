// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : failed for a case when I had while(curr<right) as the condition

// Your code here along with comments explaining your approach
// this is the code from the lecture, have 3 pointers, left, curr, right
// left index indicating elements before it have all 0's
// right index indicating all elements after it are 2's
// move curr from 0 till it encounters right
// 3 rules
// if nums[curr]==1 move curr
// if nums[curr]==2 swap nums[curr] with nums[right]
// if nums[curr]==0 swap nums[curr] with nums[left] 

class Solution {
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0)
            return;
        
        int left = 0;
        int curr = 0;
        int right = nums.length - 1;
        
        while(curr<=right){
            if(nums[curr]==2){
                swap(nums, curr, right);
                right--;
            }
            else if(nums[curr]==1){
                curr++;
            }
            else{
                swap(nums, left, curr);
                left++;
                curr++;
            }
        }
        
    }
}