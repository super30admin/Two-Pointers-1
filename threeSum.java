// Time Complexity: O(n log n)
// Space Complexity: 
// Did this code successfully run on Leetcode: yes
// Any problem you faced while coding this: took ref from lecture video


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {

    public static List<List<Integer>> getThreeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return res;
        int n = nums.length;
        Arrays.sort(nums);

        // taking i on first element
        for (int i = 0; i < n - 2; i++) {
            // placeholder
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            if (nums[i] > 0)
                break;
            int left = i + 1;
            int right = n - 1;

            // taking i on first element
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];

                // if sum is 0 then adding inside array as list
                if (sum == 0) {
                    List<Integer> li = Arrays.asList(nums[i], nums[left], nums[right]);
                    res.add(li);
                    left++;
                    right--;

                    // Internal duplicate check
                    // checking if left is passing right && left and right element is same then
                    // increase the left
                    while (left < right && nums[left] == nums[left - 1])
                        left++;

                    // if right and it's neighbour right element is same then increase the right
                    while (nums[right] == nums[right + 1])
                        right++;
                }
                // if sum is big then decrease the right otherwise left
                else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { -1, 0, 1, 2, -1, -4 };
        System.out.println(getThreeSum(arr));
    }
}
