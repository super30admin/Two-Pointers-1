// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
import java.util.*;

public class ThreeSum {

        public List<List<Integer>> threeSum(int[] nums) {
            Set<List<Integer>> output = new HashSet<>();
            for (int i=0;i<nums.length-2;i++){
                int target = 0 - nums[i];
                Set<Integer> set = new HashSet<>();
                for (int j = i+1;j<nums.length;j++){
                    if (set.contains(nums[j])){
                        List<Integer> ll = Arrays.asList(nums[i], nums[j], target-nums[j]);
                        Collections.sort(ll);
                        output.add(ll); 
                    } 
                    set.add(target-nums[j]);
                }
            }
            return new ArrayList<>(output);
        }
    
    
}
