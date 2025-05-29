// Time Complexity : O(n^2) where n is the length of array
// Space Complexity :O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// In this code I used a hash set to store all unique pairs and  started from te first index to check for a targte and then
// found a compliment if it is present in list add it to a new arraylist and otherwise add the indexed element to the set
import java.util.*;
public class ThreeSum {
    static List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> sol = new HashSet<>();
        int n = nums.length;

        for(int i = 0; i < n - 2; i++) {
            int target  = -1 * nums[i];
            HashSet<Integer> set = new HashSet<>();
            for(int j = i+1; j <n; j++) {
                int comp = target - nums[j];
                if(set.contains(comp)) {
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], comp);
                    Collections.sort(temp);
                    sol.add(temp);
                } else {
                    set.add(nums[j]);
                }
            }
        }
        return new ArrayList<>(sol);
    }
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println("Three elements whose sum is 0:" + threeSum(nums));
    }
}
