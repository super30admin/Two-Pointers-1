package Oct29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        
/* 
	Time Complexity: O(n^2) where n is no.of elements in nums array.
	Because we are sorting the array whose time complexity = O(n log n).
    And we need to have two nested loops over nums array to find the triplet values whose time complexity = O(n^2).
    Hence asymptotic time complexity = o (n^2)

	Space Complexity: O(1)
	No extra space used, so O(1).
	      
	Did this code successfully run on Leetcode : Yes

	Any problem you faced while coding this : No

	Approach:
	Two pointer approach used. 
	*/
        
        List<List<Integer>> res = new ArrayList<>();
        
        // edge
        if (nums == null || nums.length == 0) {
            return res;
        }
        
        // sort the given array first
        Arrays.sort(nums);
        
        int len = nums.length;
        
        for (int i = 0; i < len-2; i++) {
            
            // time optimization for array 
            if (nums[i] > 0) {
                return res;
            }
            
            // duplicate check for array element at Ith pointer
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            // Setting pointers for other two elements, since one element is fixed at Ith index in current iteration
            int j = i+1;
            int k = len-1;
            
            // Moving j and k pointers while i is fixed for the iteration
            while (j < k) {
                
                // if triplet found, add to result list and move both pointers j and k to find any other values of j and k with the fixed i such that the three form a zero sum triplet again.
                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> innerLst = new ArrayList<>();
                    innerLst.add(nums[i]);
                    innerLst.add(nums[j]);
                    innerLst.add(nums[k]);
                    res.add(innerLst);
                    j++;
                    k--;
                    // duplicate check for array element at Jth pointer
                    while (j > 0 && j < k && nums[j] == nums[j-1]) {
                        j++;
                    }
                    // duplicate check for array element at Kth pointer
                    while (k < len && j < k && nums[k] == nums[k+1]) {
                        k--;
                    }
                } 
                // we need to increase the sum value from negative to zero, so we should increment j because it is a sorted array where moving towards right means moving from lesser to higher array values 
                else if (nums[i] + nums[j] + nums[k] < 0) {
                    j++;     
                }
                 // we need to reduce the sum value from positive to zero, so we should decrement k because it is a sorted array where moving towards left means moving from higher to lesser array values 
                else {
                    k--;
                }
            }     
        }
         return res;
    }
}
