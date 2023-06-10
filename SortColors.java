// Time Complexity : O(n) where n is the length of the nums array, as we traverse the array linearly just once
// Space Complexity : O(1) no auxiliary data structure has been used
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :
// Your code here along with comments explaining your approach
class SortColors {
    public void sortColors(int[] nums) {
        if(nums == null){
            return;
        }

        int idx = 0, left = 0;
        int right = nums.length -1;
        while(idx < nums.length){

            if(idx > right){
                break;
            }

            if(nums[idx] == 0){
                swap(idx, left, nums);
                left++; idx++;
            }else if(idx < nums.length && nums[idx] == 2){
                swap(idx, right, nums);
                right--;
            }else{
                idx++;
            }
        }
    }

    private void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}