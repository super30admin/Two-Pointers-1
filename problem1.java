// Time Complexity :  O(N)
// Space Complexity :  O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// code implements the Dutch National Flag algorithm to sort an array containing three different colors (0, 1, and 2).
// It maintains three pointers (low, mid, and high) to iterate through the array.
public class problem1 {
    public void sortColors(int[] nums) {
        int low =0, mid =0, high = nums.length - 1;
        while(mid<=high){
            if(nums[mid]==0){
                // Swapping nums[low] and nums[mid]
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else {
                // Swapping nums[mid] and nums[high]
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }

        }
    }
}
