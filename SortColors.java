/*TC - O(N)
 *SC - O1)
 Ran on leetcode - yes
 * */
// Approach, three pointer apporach, pointer1 for first color, pointer2 for key traversal and inspection, and pointer 3 for the third color

class Solution {
    public void sortColors(int[] nums) {

        int p0 = 0 ;
        int p = 0;
        int p2 = nums.length-1;
        while(p <= p2 ){
            if (nums[p] == 0){
                // the color should be at the beginning of the array , so swap with p0
                int temp = nums[p];
                nums[p] = nums[p0];
                nums[p0] = temp;
                p0+=1;
                p+=1;
            } else if(nums[p]==1) {
                // no action, since its the middle most color and its at the appropriate location
                p+=1;
            } else {
                // swap p2 and p since the color at p should be at the end
                int temp = nums[p];
                nums[p] = nums[p2];
                nums[p2] = temp;

                p2-=1;
            }

        }

    }
}
