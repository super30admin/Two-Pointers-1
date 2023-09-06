//TC: O(N) SC: O(1)
class SortColors {
    public void sortColors(int[] nums) {
        int n = nums.length;
        if(nums == null || n == 0) return;
        int low  = 0;
        int mid = 0;
        int high = n - 1;
        while(mid <= high) {
            if(nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            } else if(nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            } else {
                mid++;
            }
        }
    }

    private void swap(int[] nums, int i , int j) {
        if(i==j) return;
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

//O(N^2)
// for(int i = 1; i < nums.length; i++) {
//     int j = i;
//     while( j > 0 && nums[j-1] > nums[j]) {
//         int temp = nums[j-1];
//         nums[j-1] = nums[j];
//         nums[j] = temp;
//         j--;
//     }
// }
