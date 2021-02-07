class Solution {
    public void sortColors(int[] nums) {
        int l = 0,curr = 0;
        int r = nums.length-1;
        
        int temp;
        while(curr <= r) {
            if(nums[curr] == 0) {
                temp = nums[l];
                nums[l++] = nums[curr];
                nums[curr++] = temp;
            }
            else if (nums[curr] == 2) {
                temp = nums[curr];
                nums[curr] = nums[r];
                nums[r--] = temp;
            }
            else curr++;
        }
    }
}
