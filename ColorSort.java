public class ColorSort {
    // TC is O(n)
    // SC is O(1)
    public void sortColors(int[] nums) {
        int low =0, high=nums.length-1, mid = 0;
        while(mid<=high){
            if(nums[mid] == 1) mid++;
            else if(nums[mid] == 0){
                swap(nums, mid, low);
                low++;
                mid++;
            }else{
                swap(nums, mid, high);
                high--;
            }
        }
    }
    
    private void swap(int[] nums, int idx1, int idx2){
        int temp = nums[idx1];
        nums[idx1] = nums[idx2];
        nums[idx2] = temp;
    }
}
