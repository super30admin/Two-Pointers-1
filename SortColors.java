class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) {
            return;
        }
        int i, j, k;
        i = 0;
        j = 0;
        k = nums.length - 1;
        while(j <= k) {
            if(nums[j] == 0) {
                nums[j] = nums[i];
                nums[i] = 0;
                i++;
                j++;
            } else if(nums[j] == 2) {
                nums[j] = nums[k];
                nums[k] = 2;
                k--;
            } else {
                j++;
            }
        }
    }
}