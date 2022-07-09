// Time Complexity : O(n), where n is the length of nums
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
public class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        //Continue to move the pointers until the mid pointer crosses the high pointer
        while(mid <= high){

            //if mid value is 0, swap values in low and mid indices and increment both low and mid pointers
            if(nums[mid] == 0) {
                swap(nums, low, mid);
                low++;
                mid++;
            }  //if mid value is 1, just increment the mid pointer as it is already in the right position
            else if(nums[mid] == 1){
                mid++;
            } //If the mid value is 2, swap values in mid and high indices and
            // increment only high pointer as the value in mid pointer might be 0 as well and it needs to be in the right place
            else {
                swap(nums, mid, high);
                high--;
            }
        }
        return;
    }

    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}