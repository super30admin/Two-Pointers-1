/**

Time Complexity : O(N)
Space Complexity : O(1) 
Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No


**/
class Solution 
{
    public void sortColors(int[] nums) 
    {
        if(nums == null || nums.length == 0)
            return;
        
        //we have to arrange the data inplace that is no extra array should ne created for the
        // output since the return type of this method is void
        
        int start = 0;
        int end = nums.length -1;
        int index = 0;
        
        while(index <= end && start < end)
        {
            if(nums[index] == 0)
            {
                // we have placed the 0 at the right place tracked by the start
                nums[index] = nums[start];
                nums[start] = 0;
                index++;
                start++;
            }
            else if(nums[index] == 2)
            {
                nums[index] = nums[end];
                nums[end] = 2;
                end--;
            }
            else
            {
                index++;
            }
        }
        
    }
}