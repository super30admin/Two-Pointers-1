import java.util.Arrays;
// Time Complexity : O(n) one pass solution
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
public class SortColors {

    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) return;

        int left = 0, mid = 0, right = nums.length - 1;

        while (mid <= right) {
            if (nums[mid] == 0) {
                swap(nums, mid, left);
                left++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, right);
                right--;
                continue;
            }
            mid++;
        }
    }

    private void swap(int[] nums, int mid, int index) {
        int temp = nums[index];
        nums[index] = nums[mid];
        nums[mid] = temp;
    }

    public static void main(String[] args) {
        final SortColors sortColors = new SortColors();
        int[] nums = new int[] {2,0,2,1,1,0};
        sortColors.sortColors(nums);
        System.out.println(Arrays.toString(nums));

        nums = new int[] {2,0,1};
        sortColors.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
