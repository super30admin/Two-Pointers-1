// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/*
Assign low, mid and high pointers whose ideal task is to point at 0,1 and 2 respectively.Move the mid
pointer and swap its values with low and high when found 0,2 to sort them at their positions.This way, we
eventually will have all 0s' at left, all 1's at middle and all 2's at extreme right end.
 */
class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0 , high = nums.length - 1;
        while(mid <= high) {
            if(nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
            else if(nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else
                mid++;
        }
    }

    private void swap(int[] nums, int a, int b) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}