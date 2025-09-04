import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Time Complexity : O(n ^ 2) (for finding the triplets using 2 pointers) + O(n ^ logn) (for sorting): O(n ^ 2) overall 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
//Approach: We could solve this problem in one of the four ways
//nested iterations: O(n ^ 3) time complexity, O(1) space complexity
//Hashing: O(n ^ 2) time complexity, O(n) space complexity
//Binary Search: O(n^2 logn), O(1)
//Two pointers: O(n^2), O(1)
//We will choose two pointers approach wherein after sorting, we will choose an index i and perform the 2 sum from i + 1 until n - 1
//if we find the triplet, we add it to the output, move low++ and high--, if the elements on the low are the same as low - 1, move low++, similarly if high = high - 1, high--
//if the sum > 0, move high--, else low++
public class ThreeSum {

    /**
     * 
     * @param nums the nums array
     * @return     the list of triplets that sum up to 0
     */
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length == 0) return Collections.emptyList();

        int n = nums.length;
        Arrays.sort(nums);

        final List<List<Integer>> output = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int low = i + 1, high = n - 1;
            while (low < high) {
                int current = nums[i] + nums[low] + nums[high];
                if (current == 0) {
                    output.add(Arrays.asList(nums[i], nums[low], nums[high]));

                    low++;
                    high--;

                    while (low < high && nums[low] == nums[low - 1]) low++;
                    while (low < high && nums[high] == nums[high + 1]) high--;
                } else if (current > 0) {
                    high--;
                } else low++;
            }
        }

        return output;
    }

    public static void main(String[] args) {
        final ThreeSum threeSum = new ThreeSum();
        System.out.println(threeSum.threeSum(new int[] {-1,0,1,2,-1,-4})); //return [[-1, -1, 2], [-1, 0, 1]]
        System.out.println(threeSum.threeSum(new int[] {-3, -4, -1, 0, 0, 0, 1, 3, 4, 2, 2, 8}));
        //return [[-4, 0, 4], [-4, 1, 3], [-4, 2, 2], [-3, -1, 4], [-3, 0, 3], [-3, 1, 2], [-1, 0, 1], [0, 0, 0]]
    }
}
