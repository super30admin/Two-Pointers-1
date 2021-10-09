// Time Complexity :  O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class SortColors_75 {
    public void sortColors(int[] nums) {
        if( nums == null || nums.length == 0 ){
            return;
        }
        
        int left = 0;
        int right = nums.length-1;
        int curr = 0;
        
        while(curr <= right){
            
            if(nums[curr] == 0){
                swap(nums,curr,left);
                curr++;
                left++;
            } else if(nums[curr] == 1){
                curr++;
            } else {
                swap(nums, curr, right);
                right--;
            }
            
        }
        
    }
    
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

// TC: O(n)
// SC: O(1)