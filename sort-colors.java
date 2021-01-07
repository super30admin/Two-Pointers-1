// Time Complexity : O(N) N:size of nums
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// all 0 should be before l and all 2 should be after h. This way we can sort the colors.

public void sortColors(int[] nums) {
    int l = 0;
    int h = nums.length-1;
    while(l<nums.length && nums[l] == 0) l++;
    while(h>=0 && nums[h] == 2) h--;
    int i = l;
    while(i<=h){
        if(i!=l && nums[i] == 0){
            swap(nums,i,l);l++;
        } else if(i!=h && nums[i] == 2){
            swap(nums,i,h);h--;
        } else i++;
    }
}
private void swap(int[] nums, int i, int j){
    nums[i] = nums[i] + nums[j];
    nums[j] = nums[i] - nums[j];
    nums[i] = nums[i] - nums[j];
}