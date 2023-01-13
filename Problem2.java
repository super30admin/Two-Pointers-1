import java.util.*;

public class Problem2 {
    public static void main(String[] args) {
        int[] nums = new int[] { -1, 0, 1, 2, -1, -4 };
        List<List<Integer>> result = threeSum(nums);
        System.out.print(result);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i - 1] != nums[i]) {
                int lo = i + 1;
                int hi = nums.length - 1;
                while (hi > lo) {
                    int sum = nums[lo] + nums[hi] + nums[i];
                    if (sum == 0) {
                        result.add(Arrays.asList(nums[i], nums[lo++], nums[hi--]));
                        while (lo < hi && nums[lo] == nums[lo - 1])
                            lo++;
                    } else if (sum < 0) {
                        lo++;
                    } else {
                        hi--;
                    }
                }
            }
        }
        return result;
    }
}
