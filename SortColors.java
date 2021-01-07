class Solution {
    public void sortColors(int[] nums) {
        int start=0, end = nums.length-1;
        int i=0;
        while(i<=end && i<nums.length){
            if(nums[i]==0){
                swap(nums, i, start);
                start++;
                i++;
            }
            else if(nums[i]==2){
                swap(nums, i, end);
                end--;
            }
            else
                i++;
        }
    }
    public void swap(int[] nums, int i, int j){
        int t = nums[i];
        nums[i] = nums[j];
        nums[j] = t;
    }
}

//Time complexity : O(N)
//Space complexity : O(1)
