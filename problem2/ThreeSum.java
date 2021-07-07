// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
package problem2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public void twoSum(int[] numbers, int index, List<List<Integer>> result, int n) {
		int low = index + 1;
		int high = n - 1;
		int sum;

		while (low < high) {
			sum = numbers[index] + numbers[low] + numbers[high];
			if (sum == 0) {
				result.add(Arrays.asList(numbers[index], numbers[low++], numbers[high--]));
				while (low < high && numbers[low] == numbers[low - 1]) {
					low++;
				}
			} else if (sum < 0) {
				low++;
			} else {
				high--;
			}
		}
	}

	public List<List<Integer>> threeSum(int[] nums) {

		if (nums == null || nums.length < 3) {
			return new ArrayList<>();
		}

		Arrays.sort(nums);

		int n = nums.length;
		List<List<Integer>> ans = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			if (i == 0 || nums[i] != nums[i - 1]) {
				twoSum(nums, i, ans, n);
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		ThreeSum obj = new ThreeSum();
		int[] nums = { -1, 0, 1, 2, -1, -4 };
		List<List<Integer>> result = obj.threeSum(nums);
		System.out.println("Triplets whose sum is 0:");
		for (List<Integer> triplet : result) {
			for (Integer num : triplet) {
				System.out.print(num + " ");
			}
			System.out.println();
		}
	}

}
