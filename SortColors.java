// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

/**
 * 3 ptrs to point to 0th value and 2 value and the other one to traverse thr all values
 */
class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) return;

        int pt0=0,pt1=0,pt2=nums.length-1; //pt0 - pts to all 0s and pt1 - pts to all 1s and pt2 - pts to all 2
        while(pt1<=pt2){
            if(nums[pt1] == 2){
                swap(nums,pt1,pt2);
                pt2--;
            }else if(nums[pt1] == 1){
                pt1++;
            }else{
                swap(nums,pt1,pt0);
                pt1++;
                pt0++;
            }
        }
    }
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}