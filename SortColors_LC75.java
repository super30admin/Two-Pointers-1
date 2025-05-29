/*
Did this code successfully run on LeetCode :  Yes
Any problem you faced while coding this :  No
Time complexity - O(N)
Space complexity - O(1)

*/
public class SortColors_LC75 {

    public void sortColors(int[] nums) {
        int n = nums.length;
        int low = 0;
        int high = n-1;
        int mid = 0;
        while(mid <= high) {
            if(nums[mid] == 1) {
                mid++;
            } else if(nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            } else {
                swap(nums, low, mid);
                low++;
                mid++;
            }
        }
    }
    void swap(int [] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }
}