// We use tow pointer technique to solve this problem. At first we sort the array and loop through the array, set ith index as target, and set the first pointer as 
// element next to the index and second pointer to the last element, and increase the left and right pointers to keep on updating the sum
// compare it to the target. 

// Time Complexity : O(n ^ 2), where n is the number of elements in the given array
// Space Complexity : O(1)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length == 0)
            return new ArrayList<>();

        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                int target = -nums[i];
                int left = i + 1, right = nums.length - 1;
                while (left < right) {
                    int sum = nums[left] + nums[right];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1])
                            left++;
                        while (left < right && nums[right] == nums[right - 1])
                            right--;
                        left++;
                        right--;
                    } else if (sum > target)
                        right--;
                    else
                        left++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<int[]> inputs = new ArrayList<>();
        Collections.addAll(inputs, new int[] { -1, 0, 1, 2, -1, -4 }, new int[] {}, new int[] { 0 });

        for (int[] nums : inputs) {
            System.out.println(threeSum(nums).toString());
        }
    }
}