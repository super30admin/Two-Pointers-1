// space complexity 0(n)
// time complexity 0(1)
// code sucessfully executed on leetcode
class Solution {
    public void sortColors(int[] nums) {
        
        // edge case
        if(nums == null || nums.length == 0) return ;
         int mid = 0; int low=0; int high = nums.length-1;
        
            while (mid<=high){
               // 1st case
                if(nums[mid] == 0){
                    swap(nums,low,mid);
                    low++; mid++;
                } else if(nums[mid] == 1){
                    mid++;
                } else {
                    swap(nums,mid,high);
                    high--;
                }
                    
            } }     
        private void swap(int[] nums, int i, int j){
            int temp = nums[i]; 
            nums[i] = nums[j];
            nums[j]  = temp;
        }
        
}