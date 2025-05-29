// Time Complexity : O(n) where n is the length of array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// used the Dutch national flag algorithm
import java.util.Arrays;
public class SortColors {
    static void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid <= high) {
            if(nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;

            } else if(nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }

    }
    static void swap (int[] nums, int i , int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        System.out.println("Before sorting: " + Arrays.toString(nums));
        sortColors(nums);
        System.out.println("After sorting: " + Arrays.toString(nums));
    }
}
