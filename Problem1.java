// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//To sort three colors consider three pointers low, mid and high 
//Low corresponds to color 0, high to 2, mid to 1
// compare mid against these colors and swap them accordingly and resultant array will be sorted
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0, mid = 0;
        int high = n-1;
        while(mid <= high) {
            if (nums[mid] == 2) {
                //swap with the high
                swap(nums, mid, high);
                high--;
            } else if(nums[mid] == 0) {
                //swap with the low
                swap(nums, mid, low);
                low++; mid++;
            } else {
                //when mid is 1
                mid++;
            }
        }
        
    }
    private void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;

    }
}
