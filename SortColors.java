public class SortColors {
	int temp = 0;

	public void sortColors(int[] nums) {

		int low = 0;
		int high = nums.length - 1;
		int mid = 0;
		while (mid <= high) {

			if (nums[mid] == 1) {
				mid++;
			} else if (nums[mid] == 0) {
				swap(low, mid, nums);
				low++;
				mid++;
			} else {
				swap(high, mid, nums);
				high--;

			}

		}

	}
	public void swap(int i, int j, int[] nums) {
		temp = nums[j];
		nums[j] = nums[i];
		nums[i] = temp;
	}
}
