
class SortColors {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int l = 0;
        int mid = 0;
        int r = n-1;

        while(mid <= r) {
            if(nums[mid] == 0) {
                int tmp = nums[l];
                nums[l] = nums[mid];
                nums[mid] = tmp;
                l++;
                mid++;
            } else if(nums[mid] == 2) {
                int tmp = nums[r];
                nums[r] = nums[mid];
                nums[mid] = tmp;
                r--;
            } else {
                mid++;
            }
        }
    }
}