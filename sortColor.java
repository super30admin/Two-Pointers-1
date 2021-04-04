 /*  Time Complexity: O(N) where N is the size of the array.
 *  Space Complexity: O(1) Since we do not use additional space
 *
 *  Did this code successfully run on Leetcode : Yes
 *  Any problem you faced while coding this : Design the approach to hold the min element.
 *
 *  Explanation: We have a running pointer, we also have a low and a high pointer. So we swap all the 2 to high pointer and 0s to the low pointer. This would result in 1s automatically being sorted.
 */
class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0) return;
        int low=0, high=nums.length-1,curr=0;
        while(curr<=high){
            if(nums[curr]==0){
                swap(nums, curr, low);
                ++low;
                ++curr;
            }else if(nums[curr]==2){
                swap(nums, curr, high);
                --high;
            }else{
                ++curr;
            }
        }
    }
    private void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
