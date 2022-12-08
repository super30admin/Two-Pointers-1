import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode15 {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3)
            return new ArrayList<>();

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0)
                break;// since we need sum=0 and if out nums[i] is positive then we cannot to reach to
                      // 0 because array is sorted so elemnets after nums[i] will be positive only.
            if (i > 0 && nums[i] == nums[i - 1])
                continue;// to handle the duplicay in the main loop
            int low = i + 1;
            int high = n - 1;
            while (low < high) {// why we didnt use equlas to here because we dont to have duplicate elements in
                                // the result of triplets
                int sum = nums[i] + nums[low] + nums[high];
                if (sum == 0) {
                    List<Integer> list = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(list);
                    low++;
                    high--;
                    while (low < high && nums[low] == nums[low - 1]) {// this is to handle the duplicate results from
                                                                      // left side
                        low++;
                    }
                    while (low < high && nums[high] == nums[high + 1]) {// this is to handle the duplicate results from
                                                                        // right side
                        high--;
                    }
                } else if (sum > 0) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return result;
    }
}

// tc--> O(n^2)
// sc-->O(1)
