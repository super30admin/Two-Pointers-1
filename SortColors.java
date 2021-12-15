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

        for(int i =0; i<n;i++) {
            if(nums[mid] ==0) {
                swap(nums, low++, mid++);
            } else if(nums[mid] ==2){
                swap(nums, high--, mid);
            } else {
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
