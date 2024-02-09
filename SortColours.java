// TC - O(N)
// SC - O(1)

// Constraints:
// n == nums.length
// 1 <= n <= 300
// nums[i] is either 0, 1, or 2.

public class SortColours {
    class Solution {
        public void sortColors(int[] nums) {
            int low = 0;
            int mid = 0;
            int high = nums.length - 1;
            while (mid <= high) {
                if (nums[mid] == 0) {
                    swap(nums, low, mid); // 0->low     1->mid
                    low++;
                    mid++;
                } else if (nums[mid] == 1) {
                    mid++;
                } else {
                    swap(nums, mid, high); // 2->high   0/1->mid
                    high--;
                }
            }
        }

        private void swap(int[] nums, int i, int j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
