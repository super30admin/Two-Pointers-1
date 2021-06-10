// Time Complexity : O(n)), 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :    No
package twoPointer1;

/**
 *
 * @author shilpa
 */
public class SortColors3 {
     public void sortColors(int[] nums) {
        if(nums.length == 0 || nums == null) return; 
        int mid = 0, left = 0, right = nums.length - 1;
        while(mid <= right){
            //mid = 0
            if(nums[mid] == 0){
                swap(nums, left, mid);
                left++;mid++;
            }
            //mid = 1
            else if(nums[mid] == 1){
                mid++;
            }
            //mid = 2
            else{
                swap(nums, mid, right);
                right--;
            }
        }
    }
    private void swap(int[]nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }   
}
