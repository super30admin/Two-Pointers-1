// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//Using 2 pointer approach. On encountering 2 don't update mid just reduce high.
// On encountering 0 update low and mid.
// On encountering 1 update just mid.
public class SortColorSolution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) {
            return;
        }
        
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        
        while(mid <= high) {
            if(nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            } else if(nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            } else {
                mid++;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
