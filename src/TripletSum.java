import java.util.*;

/**
 * 3Sum (Triplet Sum = 0)
 *
 * APPROACH 1: HashSet (for each i, solve 2Sum using a hash set)
 * 1) Sort nums (helps handle duplicates & keeps triplets in consistent order).
 * 2) Fix an index i as the first element.
 *    - Skip duplicate anchors (nums[i] == nums[i-1]) to avoid repeating work.
 * 3) For the remaining part (j = i+1..n-1), use a HashSet to find complements:
 *    - innerTarget = 0 - nums[i]
 *    - if we have seen (innerTarget - nums[j]) before, we found a triplet.
 * 4) Store triplets in a HashSet<List<Integer>> to ensure uniqueness.
 *
 * Time Complexity:
 * - Sorting: O(n log n)
 * - Outer loop (i): O(n)
 * - Inner loop (j): O(n) with O(1) average hash operations
 * => Total: O(n^2) time (dominant), O(n) extra space per i (hash set),
 * plus result storage.
 *
 * Note: Because we use HashSet<List<Integer>>, we also do small constant work
 * for list creation & sorting 3 elements.
 *
 *
 * APPROACH 2: Two Pointers (classic optimal for 3Sum)
 * 1) Sort nums.
 * 2) Fix i as the first number:
 *    - Skip duplicate anchors.
 *    - If nums[i] > 0, break (since nums is sorted, sum can't be 0 anymore).
 * 3) Use two pointers: low = i+1, high = n-1
 *    - sum = nums[i] + nums[low] + nums[high]
 *    - sum == 0: record triplet, move both pointers, skip duplicates
 *    - sum > 0: need smaller sum => high--
 *    - sum < 0: need larger sum  => low++
 *
 * Time Complexity:
 * - Sorting: O(n log n)
 * - Outer loop: O(n)
 * - Two pointers scan per i: O(n)
 * => Total: O(n^2) time, O(1) extra space (excluding output)
 */
public class TripletSum {

    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;
        int target = 0;

        for (int i = 0; i < n; i++) {
            // Skip duplicate "anchor" values
            if (i != 0 && nums[i] == nums[i - 1]) continue;

            HashSet<Integer> set = new HashSet<>();
            int innerTarget = target - nums[i];

            for (int j = i + 1; j < n; j++) {
                int cmp = innerTarget - nums[j];

                if (set.contains(cmp)) {
                    // Create triplet and normalize order (sorted) before adding to set
                    List<Integer> list = Arrays.asList(nums[i], nums[j], cmp);
                    Collections.sort(list); // sorts 3 elements (constant work)
                    res.add(list);
                }
                set.add(nums[j]);
            }
        }
        return new ArrayList<>(res);
    }

    public List<List<Integer>> threeSumWithTwoPointers(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            // Skip duplicate anchors
            if (i != 0 && nums[i] == nums[i - 1]) continue;

            // Early stop: if nums[i] > 0, all remaining are >= nums[i], sum can't be 0
            if (nums[i] > 0) break;

            int low = i + 1, high = n - 1;

            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;

                    // Skip duplicates for low and high
                    while (low < high && nums[low] == nums[low - 1]) low++;
                    while (low < high && nums[high] == nums[high + 1]) high--;
                } else if (sum > 0) {
                    high--;
                } else {
                    low++;
                }
            }
        }
        return res;
    }

    private static void printTriplets(String title, List<List<Integer>> triplets) {
        System.out.println(title);
        if (triplets.isEmpty()) {
            System.out.println("  (no triplets)");
            return;
        }
        for (List<Integer> t : triplets) {
            System.out.println("  " + t);
        }
    }

    public static void main(String[] args) {
        TripletSum solver = new TripletSum();

        // Test cases (common LeetCode style)
        int[][] tests = {
                {-1, 0, 1, 2, -1, -4},
                {0, 1, 1},
                {0, 0, 0, 0},
                {-2, 0, 0, 2, 2},
                {-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6}
        };

        for (int tc = 0; tc < tests.length; tc++) {
            int[] nums1 = Arrays.copyOf(tests[tc], tests[tc].length);
            int[] nums2 = Arrays.copyOf(tests[tc], tests[tc].length);

            System.out.println("====================================");
            System.out.println("Test #" + (tc + 1) + " Input: " + Arrays.toString(tests[tc]));

            List<List<Integer>> ansHash = solver.threeSum(nums1);
            List<List<Integer>> ansTwoPtr = solver.threeSumWithTwoPointers(nums2);

            printTriplets("HashSet approach result:", ansHash);
            printTriplets("Two Pointers approach result:", ansTwoPtr);
        }
    }
}

