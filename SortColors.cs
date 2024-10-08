// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

 public class Solution {
    public void SortColors(int[] nums) {
        

         int low = 0, mid = 0;
        int high = nums.Length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap nums[low] and nums[mid], and move both low and mid pointers
                Swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // If it's 1, just move mid forward
                mid++;
            } else if (nums[mid] == 2) {
                // Swap nums[mid] with nums[high] and move high backward
                Swap(nums, mid, high);
                high--;
            }
        }
    }

    // Helper method to swap elements
    private void Swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
}