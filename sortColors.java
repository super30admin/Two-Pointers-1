// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes

public class sortColors {

	public void sortColors(int[] nums) {

		// edge case
		if (nums == null || nums.length == 0)
			return;

		// three pointers
		int h = nums.length - 1, l = 0, m = 0;

		// when mid cross high stop
		while (m <= h) {
			if (nums[m] == 1) {
				m++;
			}
			// increase middle too bcs for sure there will be not 2
			else if (nums[m] == 0) {
				swap(nums, l, m);
				l++;
				m++;
			} else {
				swap(nums, h, m);
				h--;
			}
		}
	}

	public void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

}
