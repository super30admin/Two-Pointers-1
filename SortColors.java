// TC - O(n)
// space - O(1)
// leetcode passed - Yes

public class SortColors {

    public void sortColors(int[] nums) {
        if(nums == null || nums.length ==0) {
            return;
        }

        int n = nums.length;

        int low = 0;
        int mid =0;
        int high = nums.length-1;

        // Low is handling 0
        // mid is handling 1
        // high is handling 2
        for(int i =0; i<n;i++) {
            if(nums[mid] ==0) {
                // we swap the two so that 0 comes with low and 1 comes with mid, and we increment them to move further
                swap(nums, low++, mid++);
            } else if(nums[mid] ==2){
                // we swap the two so that 2 comes with high and 1 comes with mid, and we decrement high only
                // because the mid could have 0 with it after the swap
                swap(nums, high--, mid);
            } else {
                // mid already have 1
                mid++;
            }
        }
    }

    void swap(int[] nums, int m, int n) {
        int temp =nums[m];
        nums[m] =nums[n];
        nums[n]=temp;
    }
}
