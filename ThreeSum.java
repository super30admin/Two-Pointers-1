// ThreeSum: Find 3 elements where sum of them is zero
// Bruteforce
// TC: O(n^3)
// SC: O(1)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0;i<nums.length;i++) {
            for(int j=i+1;j<nums.length;j++) {
                for(int k=j+1;k<nums.length;k++) {
                    if(nums[i] + nums[j] + nums[k] == 0) {
                    	List<Integer> a = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(a);
                        if(!result.contains(a))
                            result.add(a);
                    }
                }
            }
        }
    return result;
    }
}

//Hashing 
// TC: O(n*2)
// SC: O(n)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue; // Skip duplicates for the first element
            seen.clear(); // Clear the set for the new i
            for (int j = i + 1; j < nums.length; j++) {
                int complement = -nums[i] - nums[j];
                if (seen.contains(complement)) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], complement);
                    Collections.sort(triplet);
                    result.add(triplet);
                }
                seen.add(nums[j]);
            }
        }
        
        return new ArrayList<>(result);
    }
}

// Two-pointer technique
//TC: O(n*2)
//SC: O(1)
//Did this code successfully run on Leetcode : Yes
//Any problem you faced while coding this : No
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++) {
            if(i>0 && nums[i] == nums[i-1]) continue;
            int j = i+1;
            int n = nums.length-1;
            while(j < n) {
                if(nums[j] + nums[n] == (nums[i]*-1)) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[n]);
                    result.add(triplet);
                    j++;
                    n--;
                    while(j<n && nums[j] == nums[j-1]) {
                        j++;
                    }
                    while(j<n && nums[n] == nums[n+1]) {
                        n--;
                    }

                } else if(nums[j] + nums[n] <= nums[i]*-1) {
                    j++;
                } else {
                    n--;
                }
            }
        }
        return result;
    }
}