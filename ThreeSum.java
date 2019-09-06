/**
 * 
 * Given an array nums of n integers, are there elements a, b, c in nums 
 * such that a + b + c = 0? Find all unique triplets in the array which 
 * gives the sum of zero.
 * 
 * The Idea is similar to solving the 2sum problem. We start off by sorting the
 * elements, p tracks the first element for the triplet. q and r are the two
 * pointer that go on to find out proper matches such that sum equals 0. We also
 * take care to slide over dups so as to not add duplicate triplets inside our
 * result.
 * 
 * Time Complexity: O(nlgn) 
 * Space Complexty: O(1) constant
 * 
 * Leetcode Result:
 * 
 * Runtime: 27 ms, faster than 95.01% of Java online submissions for 3Sum.
 * Memory Usage: 46.6 MB, less than 91.52% of Java online submissions for 3Sum.
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        // sort array
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<>();
        int p, q, r, sum;

        for (p = 0; p < nums.length - 2; p++) {
            // eliminate duplicates
            if (p > 0 && nums[p] == nums[p - 1]) {
                continue;
            }

            q = p + 1;
            r = nums.length - 1;

            while (q < r) {
                sum = nums[p] + nums[q] + nums[r];
                // if sum is < 0, increment q
                if (sum < 0) {
                    q++;
                } else if (sum > 0) { // sum > 0, decrement r
                    r--;
                } else { // got target, add to result
                    result.add(Arrays.asList(nums[p], nums[q], nums[r]));
                    // increment q to skip duplicates if any
                    while (q < r && nums[q] == nums[q + 1]) {
                        q++;
                    }
                    // decrement r to skip duplicates if any
                    while (q < r && nums[r] == nums[r - 1]) {
                        r--;
                    }
                    q++;
                    r--;
                }
            }
        }
        return result;
    }
}