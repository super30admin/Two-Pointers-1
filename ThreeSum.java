import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
/**
 * TC - O(n^2)
 * SC - O(n)
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> result = new HashSet();
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if(sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                } else if(sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }

        return new ArrayList<>(result);
    }
}
