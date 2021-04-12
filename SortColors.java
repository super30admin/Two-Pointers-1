// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

class SortColors {
    public void sortColors(int[] nums) {
        int lo=0, hi = nums.length -1;
        for(int idx = lo; idx<=hi;){
            if(nums[idx] == 0){
                int temp = nums[lo];
                nums[lo] = nums[idx];
                nums[idx] = temp;
                idx++; lo++;
            }
            else if(nums[idx] == 2){
                int temp = nums[hi];
                nums[hi] = nums[idx];
                nums[idx] = temp;
                hi--;
            }else{
                idx++;
            }
        }
    }
}