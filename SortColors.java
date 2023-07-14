// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class SortColors {
    public void sortColors(int[] nums) {


        // Getting the count of number of 0s, 1s and 2s

        int count_0 = 0;
        int count_1 = 0;
        int count_2 = 0;

        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == 0)
            {
                count_0++;
            }

            else if(nums[i] == 1)
            {
                count_1++;
            }

            else
            {
                count_2++;
            }
        }


        // Now, as we know the count, we overwrite the array accordingly
        int i = 0;

        for(i = 0; i < count_0; i++)
        {
            nums[i] = 0;
        }


        for(; i < count_0 + count_1; i++)
        {
            nums[i] = 1;
        }

        for(; i < nums.length; i++)
        {
            nums[i] = 2;
        }

    }
}