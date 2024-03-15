class Solution {
    /* Time Complexity: O(n);
    Space Complexity : O(1);

    Executed in leetcode;
    */
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) return;
        int n = nums.length;
        int l =0;
        int mid = 0;
        int h = n -1;

        while (mid <= h ){
            if (nums[mid] == 0){
                swap(nums, mid, l);
                l++;
                mid ++;

            }else if (nums[mid] == 2){
                swap(nums, mid, h);
                h--;

            }else{
                mid ++;
            }
        }
    }
    private void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j]= temp;
    }
}