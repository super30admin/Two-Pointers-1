// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :No

class Solution {
    public void sortColors(int[] nums) {
        if(nums==null||nums.length==0) return;
        
        int low=0; int high=nums.length-1; int mid=0;
        
        while(mid<=high)
        {
            if(nums[mid]==1)
            {
                //swap(nums,mid,high);
                mid++;
            }
            else if(nums[mid]==2)
            {
                swap(nums,mid,high);
                high--;
                
            }
            else
            {
                swap(nums,low,mid);
                low++;mid++;
            }
        }
    }
    
    public void swap(int[] nums,int low,int high)
    {
        int temp=nums[low];
        nums[low]=nums[high];
        nums[high]=temp;
    }
    
}
