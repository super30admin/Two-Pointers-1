/*the following implementation is to sort colors
 * the time complexity of this implementation is O(n)*/
import java.util.Arrays;

class SortColors {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                // swap with the last red element
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // do nothing and move the mid pointer
                mid++;
            } else {
                // swap with the first blue element
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int[] nums = {2, 0, 2, 1, 1, 0};
        SortColors colors = new SortColors();
        colors.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

}
