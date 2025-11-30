// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// 1: We use three pointers to make sure the array is divided into a red, white and blue section
// 2: If the white pointer encounters 0, we swap with red and increase both pointers
// 3: If the white pointer encounters 2, we swap with blue and decrease the blue pointer
class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = nums.length - 1;

        while(white <= blue){
            if(nums[white] == 0){
                int temp = nums[white];
                nums[white] = nums[red];
                nums[red] = temp;
                red ++;
                white++;
            }
            else if(nums[white] ==1){
                white++;
            }
            else{
                int temp = nums[white];
                nums[white] = nums[blue];
                nums[blue] = temp;
                blue--;
            }
        }
    }
}