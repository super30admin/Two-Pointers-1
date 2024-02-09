import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// TC - O(N^3)
// SC - O(N) - ResultSet

// Constraints:
// 3 <= nums.length <= 3000
// -10^5 <= nums[i] <= 10^5

public class ThreeSumBrute {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Set<List<Integer>> resultSet = new HashSet<>();
            for (int i = 0; i < nums.length - 2; i++) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    int target = (nums[i] + nums[j]) * (-1);
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[k] == target) {
                            List<Integer> tripletList = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                            Collections.sort(tripletList);
                            resultSet.add(tripletList);
                        }
                    }
                }
            }

            return new ArrayList<>(resultSet);
        }
    }
}
