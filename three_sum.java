
/**
 * Provides two methods to solve the 3Sum problem: finding all unique triplets in an array that sum to zero.
 *
 * Methods:
 * 
 * 1. threeSum_twopointers:
 *    - Uses sorting and the two-pointer technique.
 *    - For each element, uses two pointers (low and high) to find a pair that adds to the negative of the fixed element.
 *    - Skips duplicates during iteration to avoid repeated triplets.
 *    - Time Complexity: O(n^2)
 *      - Sorting takes O(n log n), and each two-pointer scan is O(n).
 *    - Space Complexity: O(1)
 *      - For storing three pointers.
 *
 * 2. threeSum_HashSet:
 *    - Uses a HashSet to find complement pairs for each fixed first element.
 *    - For each valid triplet, it is sorted before adding to a result HashSet to ensure uniqueness.
 *    - Time Complexity: O(n^2)
 *      - Two nested loops: outer for fixed element, inner for complement lookup.
 *    - Space Complexity: O(n)
 *      - Due to storage of seen complements and the result set.
 *
 * Both methods return a list of all unique triplets [a, b, c] such that a + b + c = 0.
 */

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;;

public class three_sum {
    public static List<List<Integer>> threeSum_twopointers(int[] nums) {
        HashSet<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if ((i > 0) && (nums[i - 1] == nums[i]))
                continue;
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (sum == 0) {
                    List<Integer> res = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(res);
                    low++;
                    high--;
                    while (low < high && nums[low] == nums[low - 1]) {
                        low++;
                    }
                    while (low < high && nums[high] == nums[high + 1]) {
                        high--;
                    }
                } else if (sum < 0) {
                    low++;
                } else {
                    high--;
                }
            }
        }

        return new ArrayList<>(result);
    }

    public static List<List<Integer>> threeSum_HashSet(int[] nums) {
        if (nums == null || nums.length == 0)
            return new ArrayList<>();
        HashSet<List<Integer>> result = new HashSet<>();

        if (nums.length == 3) {

            List<Integer> li = Arrays.asList(nums[0], nums[1], nums[2]);

            if (nums[0] + nums[1] + nums[2] == 0) {

                result.add(li);

            }

            return new ArrayList<>(result);

        }

        for (int i = 0; i < nums.length - 2; i++) {
            int first = nums[i];
            int target = 0 - first;
            HashSet<Integer> seen = new HashSet<>();
            for (int j = i + 1; j < nums.length; j++) {
                int compliment = target - nums[j];
                if (seen.contains(nums[j])) {
                    List<Integer> res = Arrays.asList(first, compliment, nums[j]);
                    Collections.sort(res);
                    result.add(res);
                } else {
                    seen.add(compliment);
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {

        int[] nums_1 = { -1, 0, 1, 2, -1, -4 };
        int[] nums_2 = { 0, 1, 1 };
        int[] nums_3 = { 0, 0, 0 };

        List<List<Integer>> res_1 = threeSum_HashSet(nums_1);
        System.out.println(res_1.toString());

        List<List<Integer>> res_2 = threeSum_HashSet(nums_2);
        System.out.println(res_2.toString());

        List<List<Integer>> res_3 = threeSum_HashSet(nums_3);
        System.out.println(res_3.toString());

        List<List<Integer>> res_4 = threeSum_twopointers(nums_1);
        System.out.println(res_4.toString());

        List<List<Integer>> res_5 = threeSum_twopointers(nums_2);
        System.out.println(res_5.toString());

        List<List<Integer>> res_6 = threeSum_twopointers(nums_3);
        System.out.println(res_6.toString());
    }
}
