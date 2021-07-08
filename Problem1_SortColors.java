// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public void sortColors(int[] nums) {
        
        int low=0;
        int index=0;
        int high=nums.length-1;
        
        while(index<=high)
        {
            if(nums[index]==0)
            {
                swap(nums,index,low);
                index++;
                low++;
                
            }
            else if(nums[index]==2)
            {
                swap(nums,index,high);
                high--;
            }
            else
            {
                index++;
            }
        }
    }
    
    private void swap(int[] nums,int low,int high)
    {
        int temp=nums[low];
        nums[low]=nums[high];
        nums[high]=temp;
    }
}
