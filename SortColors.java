/**
 * TC - O(n)
 * SC - O(1)
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length - 1;

        while(mid <= high) {
            if(nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            }
            else if(nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;

            } else {
                mid++;
            }
        }
    }

    void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
