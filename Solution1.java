//Time Complexity: O(n)
//Space Complexity: O(1)

class Solution1 {
    public void sortColors(int[] nums) {
        int len = nums.length;
        int low = 0;
        int high = len-1;
        int mid = low;
        while( mid <= high ) {
            if( nums[mid] == 2 ) {
                swap(nums, mid, high);
                high--;
            } else if( nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            } else {
                mid++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        if( i == j) {
            return;
        }
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}