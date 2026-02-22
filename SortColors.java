class SortColors {
    public void sortColors(int[] nums) {

        int n = nums.length;

        int low = 0, mid = 0, high = n - 1;

        while(mid <= high) {
            if(nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            } else if(nums[mid] == 0) {
                swap(nums, mid, low);
                low++; mid++;
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