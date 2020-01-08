package com.exmaple.problems;

import java.util.*;


// Time Complexity : O(N^3) for Brute Force,O(N^2 + log N) for Two Pointer Approach
// Space Complexity : O(1) for Brute Force and Two Pointer
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : There exist Hashing Solution to problem 

// Your code here along with comments explaining your approach
/* 
Brute Force Try all combinations of triplet and check sum 
Two Pointer Approach
We will be using Two Pointer approach to sort the colors.
This approach is used in BinarySearch.
*/

public class UniqueTripletsSumZero {
	void findTriplets(int nums[]) {
		List<List<Integer>> out = new ArrayList<>();
		TreeSet<String> set = new TreeSet<String>();
		Arrays.sort(nums);
		int n = nums.length;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (nums[i] + nums[j] + nums[k] == 0) {
						String str = new StringBuffer().append(nums[i]).append(":").append(nums[j]).append(":")
								.append(nums[k]).toString();
						if (!set.contains(str)) {
							List<Integer> temp = new ArrayList<>();
							temp.add(nums[i]);
							temp.add(nums[j]);
							temp.add(nums[k]);
							out.add(temp);
							set.add(str);
						}
					}
				}
			}
		}

	}
	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> out = new ArrayList<>();
		Arrays.sort(nums);
		TreeSet<String> set = new TreeSet<String>();
		if (nums == null || nums.length == 0)
			return out;
		int size = nums.length;

		for (int i = 0; i < size - 1; i++) {
			int l = i + 1;
			int r = size - 1;
			int x = nums[i];
			while (l < r) {
				if (x + nums[l] + nums[r] == 0) {
					// print elements if it's sum is zero
					String str = new StringBuffer().append(nums[i]).append(":").append(nums[l]).append(":")
							.append(nums[r]).toString();
					if (!set.contains(str)) {
						List<Integer> temp = new ArrayList<>();
						temp.add(x);
						temp.add(nums[l]);
						temp.add(nums[r]);
						out.add(temp);
						set.add(str);
					}
					l++;
					r--;
				}
				// If sum of three elements is less
				// than zero then increment in left
				else if (x + nums[l] + nums[r] < 0)
					l++;

				// if sum is greater than zero than
				// decrement in right side
				else
					r--;
			}
		}
		return out;
	}
}
