package TwoPointers1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * 
 * 3 Sum solved using two pointer approach. Duplicacy is handled by moving the pointer to the
 * next unique element once the current value has been used.
 *   
 * Time Complexity :
 * O(n^2) as for every i, we search within i+1 to N for a valid pair
 *  
 * Space Complexity :
 * O(1) as we are not using any auxillary DS
 * 
 * Did this code successfully run on Leetcode : yes
 * 
 * Any problem you faced while coding this : yes, felt hard to write the exact conditions to move pointers
 */
public class Problem2 {
	public List<List<Integer>> threeSum(int[] nums) {

		Arrays.sort(nums);
		List<List<Integer>> list = new ArrayList<>();

		int idx = 0;

		boolean leftMoved = false;
		boolean rightMoved = false;

		while (idx <= nums.length - 3) {
			int left = idx + 1;
			int right = nums.length - 1;

			if (nums[idx] > 0)
				break;

			while (left < right) {

				int sum = nums[idx] + nums[left] + nums[right];

				if (sum == 0) {
					list.add(Arrays.asList(nums[idx], nums[left], nums[right]));
					left++;
					right--;
					leftMoved = rightMoved = true;
				} else if (sum < 0) {
					leftMoved = true;
					left++;
				}

				else {
					rightMoved = true;
					right--;
				}

				if (leftMoved)
					while (left < nums.length - 1 && nums[left] == nums[left - 1])
						left++;
				if (rightMoved)
					while (right > 0 && nums[right] == nums[right + 1])
						right--;

				leftMoved = rightMoved = false;
			}

			idx++;
			if (idx < nums.length - 1 && nums[idx] == nums[idx - 1])
				while (idx < nums.length - 1 && nums[idx] == nums[idx - 1])
					idx++;

		}
		return list;
	}
}
