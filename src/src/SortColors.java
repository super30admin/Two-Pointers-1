public class SortColors {
    /*
    TC : O(n)
    SC :O(1)
    LeetCode : yes
    problems faced :no
     */

    /**
     * The approach is to keep a count of 0s,1s,2s and later populate the array with this count
     * @param nums
     */
    public void sortColors(int[] nums) {
        int counter2=0;
        int counter1=0;
        int counter0=0;

        for(int i=0;i<nums.length;i++)
        {

            switch(nums[i])
            {
                case 0:
                    counter0++;
                    break;

                case 1:
                    counter1++;
                    break;

                case 2:
                    counter2++;
                    break;
            }
        }

        for(int i=0;i<counter0;i++)
        {
            nums[i]=0;

        }

        for(int i=0;i<counter1;i++)
        {
            nums[counter0 + i]=1;
        }

        for(int i=0;i<counter2;i++)
        {
            nums[counter0+counter1 + i]=2;
        }

    }


    /*
      TC : O(n)
    SC :O(1)
    LeetCode : yes
    problems faced :no

     */

    /**
     * Approach is to use 3 pointers, one for keeping the rightmost boundary for 0s, one for leftmost boundary of 2s
     * and third for current elemens while iteration
     * @param nums
     */
    public void sortColors_approach_two(int[] nums) {
        int p0 = 0, curr = 0, p2 = nums.length - 1;

        int temp;
        while (curr <= p2) {
            if (nums[curr] == 0) {
                // swap elements at indices  p0 and curr
                //p0++ curr++
                temp = nums[p0];
                nums[p0++] = nums[curr];
                nums[curr++] = temp;
            }
            else if (nums[curr] == 2) {
                // sswap elements at indices  p0 and curr
                // p2--
                temp = nums[curr];
                nums[curr] = nums[p2];
                nums[p2--] = temp;
            }
            else curr++;
        }
        }
    }

