
// Time Complexity : O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
//Here I have used two hashset extending two sum problem solution, without two pointer.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
        public List<List<Integer>> threeSum(int[] nums) {
            ArrayList<List<Integer>> list = new ArrayList<List<Integer>>();

            Arrays.sort(nums);
            for(int i=0; i<nums.length-2; i++) {
                //remove outer duplicates
                if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
                    int total = -(nums[i]);
                    HashSet<Integer> set = new HashSet<>();
                    for(int j=i+1; j<nums.length; j++){
                        int complement = total - nums[j];
                        if(set.contains(complement)){
                            list.add(Arrays.asList(nums[i], nums[j],complement));
                            //remove inner duplicates
                            while (j < nums.length - 1 && nums[j] == nums[j + 1]) {
                                j++;
                            }
                        }
                        set.add(nums[j]);
                    }
                }
            }
            return list;
        }
}
