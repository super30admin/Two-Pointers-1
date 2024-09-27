package day12_TwoPointers1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Idea : 1. Sort array, consider first element and take two pointers, one after the first element and one at end.
	   2. Check whether their addition is 0, if not, then check whether its greater than 0 
	   	  to shift right pointer to previous max number, else move left pointer to next big number.
	   3. Keep on ignoring the repeating numbers and keep on adding triplets in the result list.  
Time Complexity : O(n^2) where n is the number of elements in array
Space Complexity : O(n) as we have new result array space.
Did this code successfully run on Leetcode : yes
Any problem you faced while coding this : no
*/

public class ThreeSum {

	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> result = new ArrayList<>();

		for (int i = 0; i < nums.length - 2; i++) {

			if (i >= 1 && nums[i] == nums[i - 1]) {
				continue;
			}

			int sum, left = i + 1, right = nums.length - 1;

			while (left < right) {

				sum = nums[i] + nums[left] + nums[right];
				if (sum == 0) {
					result.add(Arrays.asList(nums[i], nums[left], nums[right]));

					while ((left + 1 < right) && nums[left] == nums[left + 1]) {
						left++;
					}

					while ((left < right - 1) && nums[right] == nums[right - 1]) {
						right--;
					}

					left++;
					right--;
				} else if (sum > 0) {
					right--;
				} else
					left++;
			}
		}

		return result;
	}

	// BRUTE FORCE
	
	/*	    public List<List<Integer>> threeSum(int[] nums) {
			    List<List<Integer>> output = new ArrayList<List<Integer>>();
			    for(int i=0; i<nums.length - 2; i++)
			    {
			        for(int j=1; j<nums.length - 1; j++)
			        {
			            for(int k=2; k<nums.length; k++)
			            {
			                if(nums[i] + nums[j] + nums[k] == 0 && i != j && j != k && k != i){
			                    List<Integer> list= new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
			                    Collections.sort(list);
			                    if(!output.contains(list))
			                    	output.add(list);
			                }
			            }
			        }
			    }
			    return output;
			}
*/	
	
}
