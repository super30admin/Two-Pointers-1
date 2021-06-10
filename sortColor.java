// Time Complexity : O(n)
// Space Complexity : O(1);
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
            int r = n-1;
            int mid = 0;
            int  l = 0;
            while(mid <= r) {
                //Swap all 1's with mid and increase mid
                //Swap all 0's with left and increase left
                //Swap all 2's with end and increase end
                if(nums[mid]==1) {
                    mid++;
                } else if(nums[mid] == 0) {
                    swap(nums, l, mid);
                    l++;
                    mid++;
                } else if(nums[mid] == 2) {
                    swap(nums, mid, r);
                    r--;
                }
            }
    }
    
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
