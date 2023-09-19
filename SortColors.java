// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes https://leetcode.com/problems/sort-colors/submissions/1053392897/
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
/*
 * Maintain 3 pointers: left, right, mid where left to maintain 0's, mid for 1's, right for 2's
 * Check nums[mid] for 0,1,2. If 0, swap left & mid, increment both. If 1, increment mid. If 2 swap mid,right and decrement right
 */
class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length ==0)
            return;
        int left=0;
        int mid =0 ;
        int right = nums.length-1;
        for(int i=0; i< nums.length;i++){
            if(nums[mid]==2){
                swap(nums, mid, right);
                right--;
            }
            else if(nums[mid]==0){
                swap(nums, mid, left);
                mid++;
                left++;

            }
            else{
                mid++;
            }
        }

    }
    void swap(int[] nums, int l, int r){
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }
}