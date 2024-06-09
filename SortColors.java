class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) {
            return;
        }

        int left = 0;
        int mid = 0;
        int right = nums.length - 1;
        while(mid <= right) {
            if(nums[mid] == 0) {
                swap(nums, mid, left);
                left++;
                mid++;
            } else if(nums[mid] == 2) {
                swap(nums, mid, right);
                right--;
            } else {
                mid++;
            }
        }
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
