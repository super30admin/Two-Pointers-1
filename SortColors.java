// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach:  We are using 3 pointers here. left, mid and right.
// left is for 0, mid is for 1 and right is for 2. We are iterating through the array and if we find 2, we swap it with right pointer and decrement right pointer.
// If we find 0, we swap it with left pointer and increment left and mid pointers. If we find 1, we just increment mid pointer.

public class SortColors {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }

        int left = 0, mid = 0, right = nums.length-1;

        // right is for 2, mid for 1 and left for 0

        while(mid <= right){
            if(nums[mid] == 2){
                swap(nums, mid, right);
                right--;
            }else if(nums[mid] == 0){
                swap(nums, mid, left);
                left++;
                mid++;
            }else{
                mid++;
            }
        }
    }

    private void swap(int[] nums, int p1, int p2){
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }

}
