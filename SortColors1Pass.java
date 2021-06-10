// Time Complexity : O(N) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

/**
 * 1. Mantain 3 pointers. start pointer at 0, end pointer at n-1 and curr pointer at 0.
 * 2. if element is 0 swap current and start pointer and increment start and current pointers.
 * 3. if element is 2 swap current and end pointer and decrement end pointers.
 * 4. if element is 1 increment curr pointer.
 */

import java.util.Arrays;

public class SortColors1Pass {
	public void sortColors(int[] nums) {
		int startPointer = 0;
		int curr = 0;
		int endPointer = nums.length - 1;

		int tmp;
		while (curr <= endPointer) {
			if (nums[curr] == 0) {
				tmp = nums[startPointer];
				nums[startPointer++] = nums[curr];
				nums[curr++] = tmp;
			} else if (nums[curr] == 2) {
				tmp = nums[curr];
				nums[curr] = nums[endPointer];
				nums[endPointer--] = tmp;
			} else {
				curr++;
			}
		}

	}

	public static void main(String[] args) {
		int[] nums = new int[] { 2, 0, 2, 1, 1, 0 };
		new SortColors1Pass().sortColors(nums);
		System.out.println(Arrays.toString(nums));
	}
}
