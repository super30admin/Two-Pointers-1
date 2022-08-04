import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

// Time Complexity : O(n*n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
// 1. Two pointer approach

//15. 3Sum (Medium) - https://leetcode.com/problems/3sum/
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
    	// Brute force approach
//        if (nums == null || nums.length == 0) return new ArrayList<>();
//        
//        HashSet<List<Integer>> set = new HashSet<>();
//        int n = nums.length;
//        
//        for (int i = 0; i < n-2; i++) {
//            for (int j = i+1; j < n-1; j++) {
//                for (int k = j+1; k < n; k++) {
//                    if ((nums[i] + nums[j] + nums[k]) == 0) {
//                        List<Integer> list = Arrays.asList(nums[i], nums[j], nums[k]);
//                        Collections.sort(list);
//                        set.add(list);
//                    }
//                }
//            }
//        }
//        
//        return new ArrayList<>(set);
    	
    	// HashSet based solution
    	// Time Complexity : O(n*n)
    	// Space Complexity : O(n)
//		if (nums == null || nums.length == 0)
//			return new ArrayList<>();
//
//		int n = nums.length;
//		HashSet<List<Integer>> set = new HashSet<>();
//
//		for (int i = 0; i < n - 2; i++) {
//			int compliment = 0 - nums[i];
//			HashSet<Integer> innerSet = new HashSet<>();
//
//			for (int j = i + 1; j < n; j++) {
//				int target = compliment - nums[j];
//
//				if (innerSet.contains(target)) {
//					List<Integer> list = Arrays.asList(nums[i], nums[j], target);
//					Collections.sort(list);
//					set.add(list);
//				} else {
//					innerSet.add(nums[j]);
//				}
//			}
//		}
//
//		return new ArrayList<>(set);
        
    	// Two pointer approach
        List<List<Integer>> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;
        
        Arrays.sort(nums);
        int n = nums.length;
        
        if (nums[0] > 0 || nums[n-1] < 0) return result;
        
        // Two pointer approach
        for (int i = 0; i < n-2; i++) {
            // outside duplicacy
            if (i != 0 && nums[i] == nums[i-1]) continue;
            int low = i+1, high = n-1;
            
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                
                if (sum == 0) {
                    List<Integer> list = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(list);
                    low++;
                    high--;

                    // to avoid duplicacy
                    while (low < high && nums[low] == nums[low-1]) low++;
                    while (low < high && nums[high] == nums[high+1]) high--;
                } else if (sum < 0) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        
        return result;
    }
}