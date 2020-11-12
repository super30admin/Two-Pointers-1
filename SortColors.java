// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach: Having three pointers to sort the colors in one pass.
// Swapping accordingly
public class SortColors {
    public void sortColors(int[] nums) {

        int left =0;
        int right = nums.length-1;
        int current = 0;

        while(current <= right){

            if(nums[current] == 0){
                //swap(nums, nums[current], nums[left]);
                int temp = nums[current];
                nums[current] = nums[left];
                nums[left] = temp;
                left++;
                current++;
            }else if( nums[current] == 2){
                //swap(nums, nums[current], nums[right]);
                int temp = nums[current];
                nums[current] = nums[right];
                nums[right] = temp;
                right--;

            }else {

                current++;
            }
        }

    }
}
