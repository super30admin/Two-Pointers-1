//Time Complexity - O(N)
//Space complexity - O(1)



class Solution {
    public void sortColors(int[] nums) {


        int p0 = 0, curr = 0;

        int p2 = nums.length - 1;

        while (curr <= p2) {

            int tmp;

            if(nums[curr] == 0) {

                tmp = nums[p0];
                nums[p0++] = nums[curr];
                nums[curr++] = tmp;

            }

            else if(nums[curr] == 2) {

                tmp =  nums[curr];
                nums[curr] = nums[p2];
                nums[p2--] = tmp;

            }

            else curr++;


        }


    }
}