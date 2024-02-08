import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// TC - O(N^2 logN + N logN) - O(N^2 logN)
// SC - O(1)

// Constraints:
// 3 <= nums.length <= 3000
// -10^5 <= nums[i] <= 10^5

public class ThreeSumBinarySearch {
    class Solution {
        private boolean binarySearch(int[] nums, int low, int high, int target) {
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (nums[mid] == target) {
                    return true;
                }
                if (nums[mid] < target) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return false;
        }

        public List<List<Integer>> threeSum(int[] nums) {
            List<List<Integer>> resultList = new ArrayList<>();
            Arrays.sort(nums); // N logN
            for (int i = 0; i < nums.length - 2; i++) { // N^2logN
                while (i != 0 && i < nums.length - 2 && nums[i] == nums[i - 1]) { // Removes External Duplicacy
                    i++;
                }
                for (int j = i + 1; j < nums.length - 1; j++) { // NlogN
                    while (j != i + 1 && j < nums.length - 1 && nums[j] == nums[j - 1]) { // Removes Internal Duplicacy
                        j++;
                    }
                    int left = j + 1;
                    int right = nums.length - 1;
                    int target = (nums[i] + nums[j]) * (-1);
                    if (binarySearch(nums, left, right, target)) { // logN
                        List<Integer> tripletList = new ArrayList<>(Arrays.asList(nums[i], nums[j], target));
                        Collections.sort(tripletList);
                        resultList.add(tripletList);
                    }
                }
            }
            return resultList;
        }
    }
}
