import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// TC - O(N^2 + NlogN) - O(N^2)
// SC - O(1)

// Constraints:
// 3 <= nums.length <= 3000
// -10^5 <= nums[i] <= 10^5

public class ThreeSumTwoPointer {
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> resultList = new ArrayList<>();
            Arrays.sort(nums);
            for (int i = 0; i < nums.length; i++) {
                while (i != 0 && i < nums.length && nums[i] == nums[i - 1]) { // Removes External Duplicacy
                    i++;
                }

                int left = i + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int target = nums[i] * (-1);
                    int currSum = nums[left] + nums[right];
                    if (currSum == target) {
                        List<Integer> tripletList = new ArrayList<>(Arrays.asList(nums[i], nums[left], nums[right]));
                        Collections.sort(tripletList);
                        resultList.add(tripletList);
                        left++;
                        right--;

                        while (nums[left] == nums[left - 1] && left < right) { // Removes Internal Duplicacy
                            left++;
                        }

                        while (nums[right] == nums[right + 1] && right > left) { // Removes Internal Duplicacy
                            right--;
                        }
                    } else if (currSum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
            return resultList;
        }
    }
}
