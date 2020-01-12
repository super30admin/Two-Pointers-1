// Time Complexity is O(N^3*NLogN) as there are three loops and one sorting operation
// Space complexity is O(N) as we are using an extra space of hashset
// This solution gives time limit exceeds on Leetcode
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumUsingBruteForceBigN34 {
	public List<List<Integer>> threeSum(int[] nums) {
		Set<List<Integer>> set = new HashSet<>();
		
		//edge case 
		if (nums == null || nums.length==0)
			return new ArrayList<List<Integer>>();
		
		for (int i =0; i<nums.length-2;i++) {
			for (int j = i+1;j<nums.length-1;j++) {
				for (int k = j+1;k<nums.length;k++) {
					int sum = nums[i] + nums[j] + nums[k];
					if (sum==0) {
						List<Integer> myList = Arrays.asList(nums[i],nums[j],nums[k]);
						Collections.sort(myList);
						set.add(myList);
					}
				}
			}
		}
		return new ArrayList<>(set);
	}
}
