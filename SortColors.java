
// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class SortColors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums);
    }

    public static void sortColors(int[] nums) {
        int n = nums.length;
        if(nums==null || n == 0)
            return;

        int start = 0, mid = 0, end = n-1;

        // If mid pointer crosses end pointer, then all are sorted
        while(mid<=end){  // T.C - O(n)
            //if mid == 0, swap it with 'start', and increase both the pointers. Because start is already sorted to its left
            if(nums[mid] == 0){
                swap(nums, start, mid);
                mid++;
                start++;
            }
            // Just increase the mid pointer
            else if(nums[mid] == 1)
                mid++;
            else{
                // Swap it with end, and decrease the end pointer
                swap(nums, mid, end);
                end--;
            }
        }
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
