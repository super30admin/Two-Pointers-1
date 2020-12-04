package dec3rd2020;

public class sortColors75 {
	public void sortColors(int[] nums) {
		// base case
		if (nums == null || nums.length == 0)
			return;
		int low = 0, mid = 0, high = nums.length - 1;
		while (mid <= high) {
			if (nums[mid] == 0) {
				swap(low, mid, nums);
				low++;
				mid++;
			} else if (nums[mid] == 1) {
				mid++;
			} else {
				swap(high, mid, nums);
				high--;
			}
		}
	}

	private void swap(int i, int j, int[] nums) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;

		// we have to use temp variable because if we use only two variable , if we use
		// input [2]
// will give wrong output
		// Time complexity O(n)
		// Space Complexity O(1)
	}

}
