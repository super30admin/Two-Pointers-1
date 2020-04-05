/**
* Time Complexity - O(n)
* Space Complexity - O(1)
*/


class Solution {
    public void sortColors(int[] nums) {

        int ptr0=0;
        int ptr2 = nums.length-1;
        int curr=0;

        while(curr<=ptr2){

            if(nums[curr]==0){

                int temp=nums[curr];
                nums[curr++] = nums[ptr0];
                nums[ptr0++] = temp;

            }else if(nums[curr]==2){


                int temp=nums[curr];
                nums[curr] = nums[ptr2];
                nums[ptr2--] = temp;

            }else{
                curr++;
            }
        }

    }
}