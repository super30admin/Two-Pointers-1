// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Approach - maintain left pointer for 0, right pointer for 2. maintain current pointer to iterate array. whenever current encounters 0, swap with left. when current encounters 2, swap with right

public class SortColors {
    public void sortColors(int[] nums) {

        int left = 0;
        int current = 0;
        int right = nums.length - 1;

        while(current <= right) {
            if(nums[current] == 0) {
                swap(nums, current, left);
                left = left + 1;
                current = current + 1;
            } else if(nums[current] == 1) {
                current = current + 1;
            } else {
                swap(nums, current, right);
                right = right - 1;
            }
        }
        
    }

    private void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;

    }


}