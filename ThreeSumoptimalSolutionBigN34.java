//Time Complexity is O(N^2)
//Space complexity is O(1) as we are not using any extra space.
//This solution is submitted on Leetcode

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumoptimalSolutionBigN34 {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>(); 
		// edge
		if (nums == null || nums.length == 0)
			return result;
		int len = nums.length;
		Arrays.sort(nums); 
		for (int i = 0; i < len - 2; i++) {
			int low = i + 1;
			int high = len - 1;
			if (nums[i]>0) break;
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			while (low < high) {
				int sum = nums[i] + nums[low] + nums[high];
				if (sum == 0) {
					result.add(Arrays.asList(nums[i], nums[low], nums[high]));
					low++;
					high--;
					while (low < high && nums[low] == nums[low - 1])
						low++;
					while (low < high && nums[high] == nums[high + 1])
						high--;
				} else if (sum < 0) {
					low++;
				} else {
					high--;
				}
			}
		}
		return result;
	}
}
