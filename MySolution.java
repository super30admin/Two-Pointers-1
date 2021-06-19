class Solution {
    public void sortColors(int[] nums) {
        int L = 0;
        int R = nums.length-1;
        int m = 0;
        while(m<=R){
            if(nums[m] == 0){
                swap(m,L,nums);
                L++;
                m++;
            }
            else if(nums[m] == 1){
                m++;
            }
            else {
                swap(m,R,nums);
                R--;

            }
        }
    }
    private void swap(int L, int R,int[] nums){
        int temp = nums[L];
        nums[L] = nums[R];
        nums[R] = temp;
    }
}