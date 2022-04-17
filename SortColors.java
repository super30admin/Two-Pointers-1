// Time Complexity : O(N) Two Pointer approach one pass
// Space Complexity : O(1) No extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
public class SortColors {
    public void sortColors(int[] nums) {

        if(nums == null || nums.length == 0){
            return;
        }

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high){

            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                mid++;
                low++;
            }else if(nums[mid] == 2){
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }else{
                mid++;
            }
        }


    }
}
