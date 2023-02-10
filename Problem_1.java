// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
/* To achieve TC of O(n) and SC of O(1), we mantain 3 pointers hi, mid and lo. lo keeps track of zeros, mid of 1 and hi of 2. Whenever mid points at 2 we replace value at it with hi,
   whenever it points at 0, we replace value at mid with lo else we just increment mid. In the end when mid > hi all elements are at required position.
*/

class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0)
            return;

        int lo = 0, mid = 0, hi = nums.length - 1;

        while(mid <= hi) {
            if(nums[mid] == 0) {
                swap(nums, mid, lo);
                lo ++;
                mid ++;
            } else if(nums[mid] == 2) {
                swap(nums, mid, hi);
                hi --;
            } else  
                mid ++;
        }
    }

    private void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}