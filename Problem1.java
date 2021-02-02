// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
    //Creating two pointers one for tracking 0 and another for 2
    //All the the 2s should be at end, so if we encounter any 2 we replace with last pointer and decrease it.
    //If we encouunter any 0 we replace it with start and increase pointer for all zero.
    //The remaing pointer will place all 1 in their place.
class Solution {
    public void sortColors(int[] nums) {
        if(nums.length==1)
            return;
        int start=0;
        int end = nums.length-1;
        int i=start;
        while(i<=end)
        {
        if(nums[i]==0)
            {
                int temp=nums[start];
                nums[start]=nums[i];
                nums[i]=temp;
                i++;
                start++;
            }
          else if(nums[i]==1)
            {
                i++;
            }
            else 
            {
                int temp=nums[end];
                nums[end]=nums[i];
                nums[i]=temp;
                end--;
            }
        }
        
    }
}