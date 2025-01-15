// TC: O(n^2)
// SC: only space used by Arrays.sort() algorithm, other than that its O(1).

import java.util.*;

public class LC15 {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int newTarget = 0 - nums[i];
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                int sum = nums[j] + nums[k];
                if (sum < newTarget) {
                    j++;
                } else if (sum > newTarget) {
                    k--;
                } else {
                    List<Integer> a = new ArrayList<>(Arrays.asList((-1) * newTarget, nums[j], nums[k]));
                    ans.add(a);
                    while (j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }
                    while (k > j && nums[k] == nums[k - 1]) {
                        k--;
                    }
                    j++;
                    k--;
                }
            }
        }
        return ans;
    }
}
