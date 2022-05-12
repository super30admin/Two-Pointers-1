//Time Complexity: O(N^2)
//Space Complexity:O(1)
//leetcode: yes

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {

            if (nums == null) {
                return new ArrayList<>();
            }
            List<List<Integer>> result = new ArrayList<>();
            Arrays.sort(nums);
            int fp = 0;

            for (int i = 0; i < nums.length - 2; i++) {
                //if the element is not same only then go ahead we don't want to consider duplicate triplets
                if (i == 0 || nums[i] != nums[i-1]) {
                    int sp = i + 1;
                    int lp = nums.length -1;
                    while (sp < lp) {
                        int sum = nums[i] + nums[sp] + nums[lp];
                        if (sum == 0) {
                            //add them in the list
                            List<Integer> set = new ArrayList<Integer>();
                            set.add(nums[i]);
                            set.add(nums[sp]);
                            set.add(nums[lp]);
                            result.add(set);
                            //important to remember if the elements match just increment and decrement the counters accordingly
                            while(sp < lp && nums[sp] == nums[sp+1]) {
                                sp++;
                            }
                            while(lp > sp && nums[lp] == nums[lp-1]) {
                                lp--;
                            }
                            //move the counters after comparing the current elements otherwise we will skip them can result into failures
                            sp++;
                            lp--;
                        } else if (sum > 0) {
                            lp--;
                        } else {
                            sp++;
                        }
                    }
                }
            }
            return result;

        }
    }

}
