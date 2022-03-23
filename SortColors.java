// Time Complexity : O(n) 
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
    public void sortColors(int[] nums) {

        //dutch flag algorithm
        int n = nums.length;

        //we use 3 pointers to track each color
        int l=0; //tracks 0s
        int m=0; //tracks 1s
        int h=n-1; //tracks 2s

        //we include = because when m and h point to same index, that index can have a 0 which will need to be swapped
        while(m<=h)
        {
            //here we dont increment m because there is still a chnace of getting a 0 from right side
            //but we decrement h because we are confident there are only 2s beyond this point
            if(nums[m]==2)
            {
                swap(nums, m, h);
                h--;
            }
            //we increment m because we have thrown all 2s to the right since m is has moved till here and 1s have also be taken care, there can only be 0s before this point
            else if (nums[m]==0)
            {
                swap(nums, l, m);
                l++;
                m++;
            }
            else
                m++;
        }
    }

    public void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
