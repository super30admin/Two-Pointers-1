import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/**
 * time complexity is O(n^2)
 * space complexity is O(n) -- memory to maintain "seen" values.
 */
class Solution {
    Set<Integer> seen;
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        if(nums.length < 3) {
            return new ArrayList(result);
        }
        seen = new HashSet<Integer>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) {
            if(!seen.contains(nums[i])) {
                result.addAll(twoSum(nums, 0-nums[i], i));
            }
        }
        return new ArrayList(result);
    }
    private List<List<Integer>> twoSum(int[] nums, int target, int skipIdx) {
        Map<Integer, Integer> map = new HashMap<>();
        List<List<Integer>> result = new ArrayList<>();
        for(int i = skipIdx+1; i < nums.length; i++) {
            int comp = target - nums[i];
            if(map.containsKey(comp)) {
                List<Integer> res = new ArrayList<>();
                res.add(comp);
                res.add(nums[i]);
                res.add(nums[skipIdx]);
                Collections.sort(res);
                result.add(res);
            }
            map.put(nums[i], i);
        }
        seen.add(nums[skipIdx]);
        return result;
    }
}