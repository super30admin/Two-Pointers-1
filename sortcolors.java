/*The objective of this program is to arrange the given colored objects in a given array of colors namely RWB must be arranged such that 
the same colors are adjacent to each other and in the same order as the RWB */
//time complexity: O(N)
//space complexity: O(1)
//Ran the code on leetcode and was accepted 
class Solution {
    public void sortColors(int[] nums) {
        //j as the first index
        int j = 0;
        //k as the last index
        int k = nums.length -1;
        //Index used for iterating 
        int i = 0;
        //Iterate over the array while the index is less that length of array
        while(i<=k)
        {
            //Check if the value is 0
            if(nums[i] == 0)
            {
                //swap values at i and j
                nums[i] = nums[j];
                nums[j] = 0;
                //increment j to next index
                j++;
            }
            //Check if value is 2
            if(nums[i] == 2)
            {
                //swap values at i and k
                nums[i] = nums[k];
                nums[k] = 2;
                //decrement k and move one index to left 
                k--;
                //decrement i to one index left
                i--;
            }
            //Increment i for next iteration
            i++;
        }
    }
}