// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        int l=0,m=0,h=nums.length-1;

        while(m<=h)
        {
            if(nums[m]==2)
            {
                swap(m,h,nums);
                h--;

            }

            else if(nums[m]==0)
            {
                swap(m,l,nums);
                l++;
                m++;
            }
            else
            {
                m++;
            }
        }
    }
    public void swap(int m, int n,int[] nums)
    {
        int temp=nums[n];
        nums[n]=nums[m];
        nums[m]=temp;
    }
}