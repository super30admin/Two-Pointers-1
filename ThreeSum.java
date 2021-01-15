// Time Complexity : o(n^2)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> result = new ArrayList<>();

		if (nums == null || nums.length == 0)
			return result;
		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {
			int l = i + 1, h = nums.length - 1;
			if (i > 0 && nums[i] == nums[i - 1])
				continue;

			// low and high pointers for the range i+1 to length-1
			while (l < h) {
				int sum = nums[i] + nums[l] + nums[h];
				if (sum == 0) {
					// add to result
					List<Integer> li = Arrays.asList(nums[i], nums[l], nums[h]);
					result.add(li);
					l++;
					h--;
					// Avoid repetition
					while (l < h && nums[l] == nums[l - 1])
						l++;
					while (l < h && nums[h] == nums[h + 1])
						h--;
				} else if (sum > 0) {
					h--;
				} else {
					l++;
				}
			}
		}
		return result;
	}

}
