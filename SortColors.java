// Time Complexity : o(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

//We have a high and low pointer, along with a mid pointer. based on what the mid pointer is, we will move it up or down.
//If it is 0 we move it to low, and move it to high if it is 2. 1 will stay in its position.
//by the time we go through the array, 0's will be in the beginning, 1's in middle, 2's in end


public class SortColors {
    public void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while( mid <= high){
            if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 2){
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;
                high--;
            }else{
                //if 0
                //swap low and mid
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
        }
    }
}