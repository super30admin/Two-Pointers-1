import java.util.*;

/**
 * @author Vishal Puri
 * // Time Complexity : O(n^2)
 * // Space Complexity : O(1)
 * // Did this code successfully run on Leetcode : Yes
 * // Any problem you faced while coding this :
 */

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> out = new HashSet<>();
        if (nums == null && nums.length == 0) return new ArrayList<List<Integer>>(out);
        int target;
        for (int i = 0; i < nums.length; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            target = nums[i] * -1;
            for (int j = i + 1; j < nums.length; j++) {
                if (i != j) {
                    int complement = target - nums[j];
                    if (map.containsKey(nums[j])) {
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[map.get(nums[j])]);
                        Collections.sort(temp);
                        out.add(temp);
                    } else {
                        map.put(complement, j);
                    }
                }
            }
        }
        return new ArrayList<List<Integer>>(out);
    }
}
