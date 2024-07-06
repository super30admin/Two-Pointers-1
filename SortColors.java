//Time Complexity - O(n)
//Space Complexity - O(1) as we are not using any space other than extra variables

class Solution {
    public void sortColors(int[] nums) {
        int red = 0;
        int white = 0;
        int blue = nums.length - 1;
        while(white <= blue){
            if(nums[white] == 2) {
                int temp = nums[white];
                nums[white] = nums[blue];
                nums[blue] = temp;
                blue--;

            }
            else if(nums[white] == 0) {
                int temp = nums[white];
                nums[white] = nums[red];
                nums[red] = temp;
                red++;
                white++;

            }
            else {
                white++;
            }

        }
    }
}