class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low=0;
        int high = n-1;
        int mid=0;
        while(mid<=high){
             if(nums[mid]==0){
                swap(nums,mid,low);
                 low++;
            }          
        
            if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }else{
                mid++;
            }
            
        }
    }
    
     public void swap(int[] nums, int low, int high) {
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }
}