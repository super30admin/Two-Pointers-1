// current, left, right

// if(cur == 2) swap left with right
// if(cur == 0) swap cur with left
// if(cur == 1) incremnt cur

// [2,1,1,0,1] - test case

//TC - O(n)
//SC - constant

//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No

class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length ==0) return;
        
        int left = 0, right = nums.length - 1, cur = 0;
        
        while(cur <= right){
            if(nums[cur] == 0){
                swap(nums,cur,left);
                left++;
                cur++;
                
            } else if(nums[cur] == 1){
                cur++;
                
            } else {
                swap(nums,cur,right);
                right--;
                    
                
            }
        }
        
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}