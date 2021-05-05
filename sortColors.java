class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;
        //Considering 3 pointers low, high, mid. 
        int low = 0 ;
        int high = nums.length - 1;
        int mid = 0;
        while (mid <= high){
            //case 1 
            if(nums[mid] == 0){
                swap(nums, mid, low);
                mid++;
                low++;
            } //case 2  
            else if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }else{ //case 3
                mid++;
            }
        }
        
    }
    private void swap(int [] nums,int i, int j){
        int temp = nums[i] ;
        nums[i] = nums[j] ;
        nums[j] = temp;
    }
}
