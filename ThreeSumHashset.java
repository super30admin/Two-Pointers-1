import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// TC - O(N^2)
// SC - O(N) - ResultSet and PreviousSet

// Constraints:
// 3 <= nums.length <= 3000
// -10^5 <= nums[i] <= 10^5

public class ThreeSumHashset {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Set<List<Integer>> resultSet = new HashSet<>();
            for (int i = 0; i < nums.length - 1; i++) {
                Set<Integer> previousSet = new HashSet<>(); // New Set needed for each iteration
                for (int j = i + 1; j < nums.length; j++) {
                    int target = (nums[i] + nums[j]) * (-1);
                    if (previousSet.contains(target)) {
                        List<Integer> tripletList = new ArrayList<>(Arrays.asList(nums[i], nums[j], target));
                        Collections.sort(tripletList);
                        resultSet.add(tripletList);
                    } else {
                        previousSet.add(nums[j]);
                    }
                }
            }

            return new ArrayList<>(resultSet);
        }
    }
}
