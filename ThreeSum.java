// Time Complexity : O(N*N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Sort the array, iterate the array and check if there are any duplicates, if
 * so ignore them. At each iteration, take low pointer as i+1 and high as last
 * index. Apply two sum on these low and high pointers and if sum is found push
 * to the answer list. Return that list. While checking for 2Sum, check that if
 * low pointer is repeating, if so, update that pointer to non-repeating index.
 *
 */
class Solution {
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		ArrayList<List<Integer>> ans = new ArrayList<>();
		for (int i = 0; i < nums.length; i++) {
			if (i == 0 || nums[i] != nums[i - 1]) {
				int j = i + 1, k = nums.length - 1;
				while (j < k) {
					int sum = nums[i] + nums[j] + nums[k];
					if (sum == 0) {
						List<Integer> res = new ArrayList<>();
						res.add(nums[i]);
						res.add(nums[j]);
						res.add(nums[k]);
						ans.add(res);
						j++;
						k--;
						while (j < k && nums[j] == nums[j - 1])
							j++;
					} else if (sum < 0) {
						j++;
					} else {
						k--;
					}
				}
			}
		}
		return ans;
	}
}
