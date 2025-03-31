import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int low = i + 1, high = n - 1;
            ;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                    while (low < high && nums[low] == nums[low - 1])
                        low++;
                    while (low < high && nums[high] == nums[high + 1])
                        high--;
                } else if (sum > 0) {
                    high--;
                } else {
                    low++;
                }
            }

        }
        return res;
    }
}

/**
 * TC: O(nlogn) + O(n^2) =~ O(n^2)
 * SC: O(1)
 */