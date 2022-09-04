class Problem1 {
    public void sortColors(int[] nums) {
        // null check
        if(nums == null || nums.length == 0) return;
        int low=0;
        int mid=0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                swap(nums, mid, high);
                high--;
                // mid++;
            }
            else if(nums[mid]==0){
                swap(nums, mid, low);
                low++;
                mid++;
            }
        }
    }
    public static void swap(int[] nums, int p1, int p2){
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
}