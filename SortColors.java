
//TC: O(n)
//SC: O(1)
// Implemented using two pointers  started with left and mid 0 and right at the ending and stop at the condition when mid crosses right
class SortColors {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) {
            return;
        }
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while(mid <= right){
            if(nums[mid] == 2){
                swap(nums, mid, right );
                right--;
            } else if(nums[mid] == 0){
                swap(nums, mid, left );
                left++;
                mid++;
            } else {
                mid++;

            }
        }

    }
    private void swap(int[] nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}