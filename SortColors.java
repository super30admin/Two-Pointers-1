// Time Complexity : O(n) n- number of elements in the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class SortColors {
	public void sortColors(int[] nums) {

		// edge
		if (nums == null || nums.length == 0)
			return;

		int low = 0, mid = 0, high = nums.length - 1;

		while (mid <= high) {
			if (nums[mid] == 0) {
				swap(nums, mid, low);
				low++;
				mid++;
			} else if (nums[mid] == 2) {
				swap(nums, mid, high);
				high--;
			} else {
				mid++;
			}
		}

	}

	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}