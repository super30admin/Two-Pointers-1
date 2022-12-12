public class Sort_Colors {

    // Time: O(n), Space: O(1)
    public void sortColors(int[] nums) {

        int start = 0, end = nums.length-1, p = 0;

        while (p <= end) {

            if (nums[p] == 2) {
                swap(p, end, nums);
                end--;
            }

            else if (nums[p] == 0) {
                swap(p, start, nums);
                start++;
                p++;
            }

            else p++;
        }
    }
    void swap(int i, int j, int[] nums) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}