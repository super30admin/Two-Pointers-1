// Time Complexity : O(n^2) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//3SUM, 2 pointer approach
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem2 {
    public List<List<Integer>> threeSum(int[] nums) {

        List<Integer> l = new ArrayList<Integer>();
        List<List<Integer>> list = new ArrayList<>();
        if (nums.length == 0 || nums == null || nums.length == 1)
            return list;
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int target = nums[i];
            int low = i + 1;
            int high = n - 1;
            while (low < high) {

                if (nums[low] + nums[high] + target == 0) {

                    l = new ArrayList<>();
                    l.add(nums[low]);
                    l.add(nums[high]);
                    l.add(target);
                    list.add(l);

                    low++;
                    while (nums[low] == nums[low - 1] && low < high)
                        low++;
                    high--;
                    while (nums[high] == nums[high + 1] && low < high)
                        high--;

                }
                // increament low
                else if (nums[low] + nums[high] < -target) {
                    low++;
                    while (nums[low] == nums[low - 1] && low < high)
                        low++;
                }
                // decrement low
                else if (nums[low] + nums[high] > -target) {
                    high--;
                    while (nums[high] == nums[high + 1] && low < high)
                        high--;
                }
            }
        }
        return list;
    }
}
