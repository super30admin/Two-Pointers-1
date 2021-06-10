// Time Complexity : O(N) 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


/**
 * 1. Find each element (0,1,2) count and store into array. similar to count sort.
 * 2. start from 0 copy index of count array according to the length.
 * 
 */

import java.util.Arrays;

public class SortColors2Pass {
	public void sortColors(int[] nums) {
		
		int[] counts = new int[3];
		
		for (int i : nums) {
			counts[i]++;
		}
		
		int index=0;
		for(int i=0;i<counts.length;i++) {
			Arrays.fill(nums,index,index+counts[i],i);
			index = index+counts[i];
		}

	}
	public static void main(String[] args) {
		int[] nums = new int[] {0};
		new SortColors2Pass().sortColors(nums);
		System.out.println(Arrays.toString(nums));
	}
}
