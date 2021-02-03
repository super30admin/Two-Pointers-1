// Time Complexity : O(n)
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO


// Your code here along with comments explaining your approach
// use two pointers one pointing to start and keep track of zeroes and
// other at end keeping track of 2's
// use third pointer to iterate throug array and if 0 encounters swap with 
// start pointer else if 2 swap with end pointer
class Solution {
   public void sortColors(int[] nums) {

       int p1 = 0, p2 = nums.length - 1, index = 0;
        while (index <= p2) {
            if (nums[index] == 0) {
                nums[index] = nums[p1];
                nums[p1] = 0;
                p1++;
            }
            if (nums[index] == 2) {
                nums[index] = nums[p2];
                nums[p2] = 2;
                p2--;
            } else {
                index++;
            }

        }
    }
}
