// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : not too many issues while coding this


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        
        if(nums==null || nums.length==0)
            return;
        
        int n=nums.length;
        int i=0,left=0,right=n-1;
        
        while(i<=right)
        {
            // move right
            if(nums[i]==0)
            {
                nums[i]=nums[left];
                nums[left]=0;
                left++;
                i++;
            }
            else if(nums[i]==2) // move left
            {
                nums[i]=nums[right];
                nums[right]=2;
                right--;
            }
           else
            i++;
        }
    }
}
