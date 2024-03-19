// Time Complexity : O(n) where 'n' is the length of nums.
// Space Complexity : O(1).
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Approach:
// maintain 3 pointers, l =i+1 and high = last index
// if we find 2, we put it at the end and decrement high
//if we find 0 we put it at the start and increment low and i
//if we find 1 we do not swap, just move to the next element
class SortColor {
    public void sortColors(int[] nums) {
        int i = 0;
        int l = 0;
        int h = nums.length - 1;
        if(nums==null || nums.length==0) return;
        while(l<=h){
            if(nums[l] == 0){
                swap(nums,i,l);
                i++;
                l++;
            }else if(nums[l] == 2){
                swap(nums,l,h);
                h--;
            }else{
                l++;
            }
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
        // nums[i] = nums[i] + nums[j];
        // nums[j] = nums[i] - nums[j];
        // nums[i] = nums[i] - nums[j];
    }
}