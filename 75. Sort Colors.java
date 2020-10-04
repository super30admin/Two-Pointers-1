class Solution {// class solution time and space of constant
    public void sortColors(int[] nums) {
        //Base case
        if(nums == null || nums.length ==0)
            return;
        int left = 0;
        int curr = 0;
        int right = nums.length - 1;
        
        while(curr<= right){
            if(nums[curr]==1)
                curr++;
            else if(nums[curr]==0)
                //see optimization
                swap(nums,left++,curr++) ;
            else
                swap(nums,curr,right--);
            
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}