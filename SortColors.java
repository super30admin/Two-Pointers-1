public class SortColors {

    // Time complexity: O(n)
    // Space complexity: O(1)
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;

        // low will point to 0
        // mid will point to 1
        // high will point to 2
        int low = 0, mid = 0;
        int high = nums.length - 1;

        while(mid < high) {
            if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;

            }
            // if mid is swapped with low, that means next element might be 1
            // So, lookout for it by incrementing mid
            else if(nums[mid] == 0) {
                swap(nums,mid,low);
                low++;
                mid++;
            }else {
                mid++;
            }
        }
    }

    private void swap(int[] nums, int mid, int high) {
        int temp = nums[mid];
        nums[mid] = nums[high];
        nums[high] = temp;
    }
}
