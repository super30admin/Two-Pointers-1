// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public void sortColors(int[] nums) {
       if(nums == null || nums.length == 0){
            return;
       }
       int left = 0; // left pointer, used for swapping 0
       int right = nums.length - 1; // right pointer, used for swapping 2
       int mid = 0; // mid pointer, used for checking other colours

       while(mid <= right){
        if(nums[mid] == 0){
            swap(nums, mid, left); // red colour occured, swap and move forward
            left++;
            mid++;
        }else if(nums[mid] == 2){
            swap(nums, mid, right); // blue colour, swap and decrease right
            right--;
        }else{
            mid++;
        }
       }

    }

    private void swap(int[] arr, int i, int j){ // swapping using temp variable
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}