// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Approach : I made two pointers storing the index where zero is supposed to go and one where the two is supposed to go. I keep iterating using idx and if I find a zero, I replace it with the zero pointer and move it ahead, if I find a 2, I replace it with two pointer and move it back. I run this while idx<=two that once we reach the two pointer, we know that all elements to right are already twos, so the middle will be ones. 

class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int two = nums.length - 1;
        int idx = 0;

        while (idx <= two) {
            if (nums[idx] == 0) {
                int temp = nums[zero];
                nums[zero] = 0;
                nums[idx] = temp;
                zero++;
                idx++;
            } else if (nums[idx] == 2) {
                int temp = nums[two];
                nums[two] = 2;
                nums[idx] = temp;
                two--;
            } else {
                idx++;
            }
        }
    }
}
