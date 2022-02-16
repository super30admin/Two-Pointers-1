// space complexity - o(1)
    //time - o(2n)
    //Ran on Leetcode successfully : Yes
    // Problem faced  : No
    //Approach : Use two pinter Approach from left and right, move all zeros to left and all non zeros to right
    // again use two pointer and move all 1 to left and all 2 to right

class Solution {
    public void sortColors(int[] nums) {

        int start = 0 ;
        int end = nums.length -1;

        while(start < end){

            while(start < end && nums[start] == 0){
                start++;
            }
            while(start < end && nums[end] != 0){
                end--;
            }

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }

        end = nums.length -1;

        while(start < end){

            while(start < end && nums[start] == 1){
                start++;
            }
            while(start < end && nums[end] == 2){
                end--;
            }

            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
        }

    }
}
