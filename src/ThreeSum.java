// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

/**
 * https://leetcode.com/problems/3sum/
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {

	//brute force, O(^3) solution
	public List<List<Integer>> threeSum1(int[] nums) {

		if(nums == null || nums.length ==0) return new ArrayList<>();

		Set<List<Integer>> set = new HashSet<>();
		int n = nums.length;

		for(int i=0; i< n-2; i++) {
			for (int j = i+1; j< n-1; j++) {
				for(int k = j + 1; k<n; k++) {
					int sum = nums[i] + nums[j] + nums[k];

					if(sum == 0) {
						List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
						Collections.sort(temp);
						if(!set.contains(temp)){
							set.add(temp); 
						}
					}
				}
			}
		}

		return new ArrayList(set);
	}
	//3 pointer solution, extension of 2 sum 2 pointer solution, O(n^2) time
	public List<List<Integer>> threeSum(int[] nums) {

		if(nums == null || nums.length ==0) return new ArrayList<>();

		Arrays.sort(nums);

		List<List<Integer>> result = new ArrayList<>();
		int n = nums.length;

		for(int i=0; i<n-2; i++) {
			//nums[i-1] == nums[i] used for avoiding outer duplicacy, if nums[i] checked once, if same value occured
			// at nums[i+1], move i to next value
			if(i > 0 && nums[i-1] == nums[i]) continue;

			if(nums[i] > 0) break; //if outer loop crosses 0, we don't need to explore

			int low = i+1,  high = n-1;

			while(low < high) {
				int sum = nums[i] + nums[low] + nums[high];

				if(sum == 0) {
					List<Integer> list = Arrays.asList(nums[i], nums[low], nums[high]);
					result.add(list);
					low++; high--;

					//this is used for avoiding inner duplicacy, since low, high changed, check base case again 
					// similar strategy for duplicacy removal used on line 18 for outer loop
					while(low < high && nums[low] == nums[low-1]) low++;
					while(low < high && nums[high] == nums[high+1]) high--;

				}else if(sum < 0) {
					low++;
				}else if(sum > 0) {
					high--;
				}
			}
		}

		return result;
	}
}
