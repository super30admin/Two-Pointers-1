//Time complexity: O(n)
//Space complexity: O(1)
//Executed on leetcode.
class Solution {
    public void sortColors(int[] nums) {
        int l =0, m=0, h = nums.length-1;
        while(m<=h)
        {
            if(nums[m]==2)          //Taking three pointers to represent each color 
            {
                int temp = nums[m]; //mid and low starts from 0 and high from last element.
                nums[m] =nums[h];
                nums[h] = temp;     //If 2 is found at mid before high, we swap those numbers so 2 goes to high. 
                h--;
            }
            else if(nums[m]==0)
            {
                int temp = nums[l]; //if 0 is found at mid, we swap low with mid. if 1 at mid 1 stays and moves pointer by one step forward and check.
                nums[l] = nums[m];
                nums[m] = temp;
                m++;
                l++;
            }
            else
                m++;
        }
    }
}