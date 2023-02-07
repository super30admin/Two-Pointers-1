// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

// Your code here along with comments explaining your approach

/**
 * Take three pointers i =0, j = 0, k = arr length - 1.
 * j will the current pointer iterating over the array till
 * it crosses k. At each iteration, check if jth number is 2,
 * if so, swap with kth index and decrement k. Do not increment j
 * in this case because there could a 0 or 1 which we need to process.
 * If the jth number is 0, swap it with ith index. Here increment both
 * i and j as they will be in correct positions already. If jth number is 1,
 * increment j and continue.
 *
 */
class Solution {
	public void sortColors(int[] nums) {
		int i = 0, j = 0, k = nums.length - 1;
		while (j <= k) {
			if (nums[j] == 2) {
				int temp = nums[k];
				nums[k] = nums[j];
				nums[j] = temp;
				k--;
			} else if (nums[j] == 0) {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				i++;
				j++;
			} else {
				j++;
			}
		}
	}
}