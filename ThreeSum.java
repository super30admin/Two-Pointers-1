//TC: O(n*2) where n is length of array.
// SC: O(n) where we are using extra space for Maps and Sets

// Using HashMap to check if the complement of 2 values is already present in map, since a+b+c =0 => c = -b-a . So, C would be present in map if the 
// element is already present, If we find the 3 elements, we sort and add the triplets to list of sets so that we don't keep duplicates of list.
// If element is not present, add the present element in the array with previous element index. This way we checking only elements in the past for the HashMap

import java.util.*;

public class ThreeSum {
	
	public void ThreSum(int[] nums) {
		
		HashSet<Integer> dups = new HashSet();
		HashSet<List<Integer>> res = new HashSet();
		HashMap<Integer, Integer> seen = new HashMap();
		
		for(int i=0;i<nums.length;i++) {
			
			if(dups.add(nums[i])) { // Check for duplicates, if adding duplicate element to Set, it will return false and the following code wont work
				// to calculate Sum.
				for(int j=i+1;j<nums.length;j++) {
					int comp = - nums[i] - nums[j];
					
					if(seen.containsKey(comp) && seen.get(comp)==i) {
						List<Integer> list = Arrays.asList(nums[i], nums[j], comp);
						Collections.sort(list);
						res.add(list);
					}else {
						seen.put(nums[j], i);
					}

				}
			}
		}	
		System.out.println(res);
		
	}
	
	public static void main(String[] agrs) {
		
		ThreeSum ts = new ThreeSum();
		int[] nums = {-1, 2, -4, 0, 1, -1};
		ts.ThreSum(nums);
	}

}
