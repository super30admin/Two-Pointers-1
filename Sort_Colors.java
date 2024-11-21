// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes 
// Any problem you faced while coding this : No

import java.util.Arrays;

public class Sort_Colors {
	/*
	 * In this function we assign three variables low and mid equal to 0 and high =
	 * nums.length -1. We Keep on iterating till mid is less or equal to the high
	 * index. At each index we check the value with nums[mid]. If we encounter 2 at
	 * nums[mid], we swap the mid and high index values and decrement the high
	 * pointer, If we encounter a 1 at nums[mid], we simply increment the mid
	 * pointer, and if we encounter a 0, we swap the mid and low index values and
	 * increment both mid and low
	 */
	public static void sortColors(int[] nums) {
		int low = 0;
		int high = nums.length - 1;
		int mid = 0;
		while (mid <= high) {
			if (nums[mid] == 2) {
				swap(nums, mid, high);
				high--;
			} else if (nums[mid] == 1) {
				mid++;
			} else {
				swap(nums, low, mid);
				low++;
				mid++;
			}
		}
	}

	/*
	 * This function swaps the two values
	 */
	public static void swap(int nums[], int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	public static void main(String[] args) {
		int color[] = { 2, 0, 2, 1, 1, 0 };
		System.out.println("Before Sorting: " + Arrays.toString(color));
		sortColors(color);
		System.out.println("After Sorting: " + Arrays.toString(color));
	}

}