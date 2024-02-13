// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :
public class Solution {
    public void SortColors(int[] nums) {
        int n = nums.Length;
        int low = 0;
        int mid = 0;
        int high = n-1;
        //Using 3 pointers to keep track of each color
        while(mid <= high) {
            if(nums[mid] == 2) {
                Swap(nums, mid, high);
                high--;
            }
            else if(nums[mid] == 0) {
                Swap(nums, mid, low);
                mid++;
                low++;
            }
            else {
                mid++;
            }
        }
    }

    private void Swap(int[] nums, int mid, int high) {
        int temp = nums[mid];
        nums[mid] = nums[high];
        nums[high] = temp;
    }
}