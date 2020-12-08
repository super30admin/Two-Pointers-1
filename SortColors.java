class Solution {
    public void sortColors(int[] nums) {
         if(nums == null || nums.length == 0){
             return;
         }
         int low = 0;
         int high = nums.length-1;
         int mid = 0;
         while(mid<=high){
             if(nums[mid] == 0){
                 swap(nums,low,mid);
                 low++;
                 mid++;
             }else if(nums[mid] == 2){
                 swap(nums,mid,high);
                 high--;
             }else{
                 mid++;
             }
         }
    }
    
    public void swap(int[] arr,int ind1,int ind2){
        int temp = arr[ind2];
        arr[ind2] = arr[ind1];
        arr[ind1] = temp;
    }
}