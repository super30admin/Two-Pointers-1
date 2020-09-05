// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approachclass Solution {
    public void sortColors(int[] nums) {
        
        if(nums==null || nums.length==0){
            return;
        }        
        
        int left=0;
        int right=nums.length-1;
        int current=0;
        
        while(current<=right){
            if(nums[current]==0){
                swap(nums, current, left);
                current++;
                left++;
            }else if(nums[current]==1){
                current++;
            }else{
                swap(nums, current, right);
                right--;
                
            }
        }
    }
    
    public void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}