

class Solution {

// Two pass solution
  // space complexity - o(1)
      //time - o(2n)
      //Ran on Leetcode successfully : Yes
      // Problem faced  : No
      //Approach : Use two pinter Approach from left and right, move all zeros to left and all non zeros to right
      // again use two pointer and move all 1 to left and all 2 to right

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

    /**** Brute Force space solution -- for the intution for optimised one pass solution ***/
    // Now if you see you have three pointers
   // Running pointer to capture 0 or 2 and ignore 1
   // if you encoutner 1 then add it to start position in resultant arrya and if you get 2 add it in the end
   // now we have to do it without using the extra space
   public void sortColors(int[] nums) {

       int[] res = new int[nums.length];

       int start = 0;
       int end = nums.length-1;
       Arrays.fill(res, 1);

       for(int i = 0; i<nums.length; i++){
               if(nums[i] == 0){
                   res[start++] = 0;
               }
               else if(nums[i] == 2){
                   res[end--] = 2;
               }
       }
        for(int i = 0; i<nums.length; i++){
            nums[i] = res[i];
        }

   }


}
