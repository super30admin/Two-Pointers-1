import java.util.*;

public class ThreeSum {
    /**
     * Fix one element and do 2 sum on remaining elements using hashing based solution to find target.
     * Unique triplets requirement will increase space complexity in this solution
     *
     * Time: O(n^2) Space: O(n)
     */
    public List<List<Integer>> threeSum1(int[] nums) {
        Set<List<Integer>> resultSet = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            Set<Integer> valueSet = new HashSet<>();
            int target = 0 - nums[i];

            for (int j = i + 1; j < nums.length; j++) {
                int complement = target - nums[j];
                if (valueSet.contains(complement)) {
                    List<Integer> triplets = Arrays.asList(nums[i], nums[j], complement);
                    Collections.sort(triplets);
                    resultSet.add(triplets);
                } else {
                    valueSet.add(nums[j]);
                }
            }
        }
        return new ArrayList<>(resultSet);
    }

    /**
     * Apply 2 pointers method to find required total on a sorted array
     *
     * Time: O(n^2) Space: O(1)
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            if (nums[i] > 0)
                break;

            if (i != 0 && nums[i] == nums[i - 1])
                continue;

            int low = i + 1;
            int high = n - 1;

            while (low < high) {
                int total = nums[i] + nums[low] + nums[high];
                if (total == 0) {
                    resultList.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;

                    while (low < high && nums[low] == nums[low - 1]) {
                        low++;
                    }

                    while (low < high && nums[high] == nums[high + 1]) {
                        high--;
                    }
                } else if (total > 0) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return resultList;
    }
}
