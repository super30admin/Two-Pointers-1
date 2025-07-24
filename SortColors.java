// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Approach : Maintain to pointers low and high at start and end of array. Los marks the end of 0s and high marks beginning of 2s
/// Iterate through array and if you come across 0, swap with low and inc it., if 2, swap with right and dec, if 1 continue
/// Repeat until you reach right

class Solution {
    public void sortColors(int[] nums) {
        int low = 0, high = nums.length-1, mid = 0;
        while(mid<=high){
            if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 0){
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else{
                swap(nums, mid, high);
                high--;
            }
        }
    }
    void swap(int nums[], int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}