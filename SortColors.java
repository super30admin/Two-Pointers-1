// Time Complexity : O(N), N - number of colors in the array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// We can keep 3 pointers for 3 colors, blue-0, red-1, white-2
// Red indicates the start of values that are unexplored
// Blue indicates the color are explored and the start of 0
// White indicates the color are explored and is the start of 2.
// Whenever red encounters blue or white color we swap them with values in the front or the rear.
public class SortColors {

        public void sortColors(int[] nums) {
            if(nums.length == 1) return;
            int blue = 0;
            int red = 0;
            int white = nums.length-1;

            while(red <= white){
                // 2 Should be swapped to the rear and white pointer should decrease
                if(nums[red] == 2){
                    swap(red, white, nums);
                    white--;
                }else if(nums[red] == 1){
                    // If red, simply move on to next. If there are blues ahead, this red will be swapped with it.
                    red++;
                }else{
                    // 0 Should be swapped to the front and blue pointer should increase
                    swap(red, blue, nums);
                    blue++;
                    red++;
                }
            }
        }

        public void swap(int i, int j, int[] nums){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

}
