
// Time Complexity : O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class three_Sum {
	/*
	 * This function first sorts the nums array and then it iterates till the index
	 * of the third last element in the array. It assigns a low pointer which is
	 * equal to the current iteration +1 and a high pointer which is equal to the
	 * last index. Again we iterate till low is less than high, and calculate the
	 * sum and if sum is equal to 0, then we increment the low pointer and decrement
	 * the high pointer. If sum is greater than 0, we decrement the high pointer, if
	 * sum is less than 0, we increment the low pointer
	 */
	public static List<List<Integer>> threeSum(int[] nums) {
		if (nums == null || nums.length < 3) {
			return new ArrayList<>();
		}
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			// duplicacy for outermost loop
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			if (nums[i] > 0) {
				break;
			}
			int low = i + 1;
			int high = nums.length - 1;
			while (low < high) {
				int sum = nums[i] + nums[low] + nums[high];
				if (sum == 0) {
					List<Integer> list = Arrays.asList(nums[i], nums[low], nums[high]);
					Collections.sort(list);
					result.add(list);
					low++;
					high--;
					// duplicacy for innermost loop
					while (low < high && nums[low] == nums[low - 1]) {
						low++;
					}
					// duplicacy for innermost loop
					while (low < high && nums[high] == nums[high + 1]) {
						high--;
					}
				} else if (sum > 0) {
					high--;
				} else {
					low++;
				}
			}
		}
		return result;
	}

	public static void main(String[] args) {
		int nums[] = { -4, -1, -1, -1, 0, 0, 1, 1, 2, 2, 2 };
		System.out.println(Arrays.toString(nums));
		List<List<Integer>> list = threeSum(nums);
		System.out.println(list);
	}
}