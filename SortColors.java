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

            // We are not incrementing mid here because
            // the number we swapped from the high position might be 0 or 1. We don't know that yet. If we increment mid then we will lose the element
            if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;

            }else if(nums[mid] == 0) {
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
