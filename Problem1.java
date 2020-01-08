// Time Complexity : 
//      sortColors() - O(n)
//      
// Space Complexity :
//      sortColors() - O(1)
//
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0)
            return;
        
        int count = 0;
        int fp = 0, lp = nums.length-1;
        
        while(fp <= lp)
        {
            if(lp == fp)
            {
                ++count;
                lp = nums.length-1;
            }
            if(nums[fp] > count)
            {
                swap(nums, fp, lp);
                --lp;
            }
            else
            {
                ++fp;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j]; 
        nums[j] = temp;
    }
}