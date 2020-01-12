//Time Complexity is O(N) as we are manipulating only the pointer
//Space complexity is O(1) as we are not using any extra space
//This solution is submitted on Leetcode

public class SortingColourBigN33 {
	public void sortColors(int[] nums) {
		// edge
		if(nums.length ==0 || nums == null)
			return;
		int low =0;
		int mid = 0;
		int high = nums.length-1;
		while(mid<=high) {
			//case 1
			if(nums[mid] ==1) {
				mid++;
			}
			else if (nums[mid] ==0) {
				swap(nums,low, mid);
				mid++;
				low++;
			}
			else {
				swap(nums,mid,high);
				high--;
			}
		}
	}
	private void swap(int [] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
