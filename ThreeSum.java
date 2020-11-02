import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> result = new ArrayList<>();
		if (nums.length == 0 || nums == null)
			return result;

		Arrays.sort(nums);
		for (int i = 1; i < nums.length - 2; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			int low = i + 1;
			int high = nums.length - 1;
			while (low < high) {
				int sum = nums[i] + nums[low] + nums[high];
				if (sum == 0) {
					result.add(Arrays.asList(nums[i], nums[low], nums[high]));
					low++;
					high--;
					while (low < high && nums[low] == nums[low - 1])
						low++;
					while (low < high && nums[high] == nums[high - 1])
						high++;

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
