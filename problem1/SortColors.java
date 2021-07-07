// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
package problem1;

public class SortColors {
	private void swap(int[] nums, int ptr1, int ptr2) {
		int temp = nums[ptr1];
		nums[ptr1] = nums[ptr2];
		nums[ptr2] = temp;
	}

	public void sortColors(int[] nums) {
		if (nums == null || nums.length < 2) {
			return;
		}

		int ptr1 = 0;
		int ptr2 = nums.length - 1;
		int ptr = 0;

		while (ptr <= ptr2) {
			if (nums[ptr] == 0) {
				swap(nums, ptr, ptr1);
				ptr++;
				ptr1++;
			} else if (nums[ptr] == 2) {
				swap(nums, ptr, ptr2);
				ptr2--;
			} else {
				ptr++;
			}
		}
	}
	
	private void print(int[] nums) {
		for(int i=0; i< nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		SortColors obj = new SortColors();
		int[] nums = {0,1,1,2,1,0};
		System.out.println("Before Sort:");
		obj.print(nums);
		obj.sortColors(nums);
		System.out.println("After Sort:");
		obj.print(nums);
	}

}
