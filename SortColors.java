class SortColors {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;
        int n = nums.length;
        int low =0;
        int mid=0;
        int high = n-1;
        while(mid<=high){
            if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }else if(nums[mid]==0){
                swap(nums, mid, low);
                mid++;
                low++;
            }else{
                mid++;
            }
        }
    }
    private void swap(int[]arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}