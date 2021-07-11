import java.util.*;

public class ThreeSum {


    //TC: O(N^2)
    //SC: O(1)
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList();
        if (nums == null || nums.length == 0)
            return result;

        Arrays.sort(nums); //logn

        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            int lowPointer = i + 1;
            int highPointer = n - 1;

            // Check no repetion
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            while (lowPointer < highPointer) {
                int sum = nums[i] + nums[lowPointer] + nums[highPointer];
                if (sum == 0) {
                    List<Integer> current = Arrays.asList(nums[i], nums[lowPointer], nums[highPointer]);
                    result.add(current);
                    lowPointer++;
                    highPointer--;

                    // Check no repetion
                    while (lowPointer < highPointer && nums[lowPointer] == nums[lowPointer - 1])
                        lowPointer++;
                    while (lowPointer < highPointer && nums[highPointer] == nums[highPointer + 1])
                        highPointer--;
                } else if (sum > 0) {
                    highPointer--;
                } else if (sum < 0) {
                    lowPointer++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> result = threeSum.threeSum(new int[] { -1, 0, 1, 2, -1, 4 });
        System.out.println("The result: " + result);
    }
}
