class Solution {
    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) {
            return;
        }
        int l, m, r, n;
        n = nums.length;
        l = 0;
        m = 0;
        r = n - 1;
        while(m <= r) {
            if(nums[m] == 0) {
                swap(nums, m, l);
                l++;
                m++;
            } else if(nums[m] == 1) {
                m++;
            } else {
                swap(nums, m, r);
                r--;
            }
        }
    }
}