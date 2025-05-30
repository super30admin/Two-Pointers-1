public class SortColors {
    /**
     * Using 3 pointers, starting with 2 at each end and one at the left end - use middle pointer as decider
     * to collect 0s at left side by swapping it with mid-pointer value and 2s at right end by swapping with right
     * and middle pointers.
     *
     * Time: O(n) Space: O(1)
     */
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 0) {
                nums[mid] = nums[low];
                nums[low] = 0;
                low++;
                mid++;
            } else {
                nums[mid] = nums[high];
                nums[high] = 2;
                high--;
            }
        }
    }
}
