class Solution {
    public void sortColors(int[] nums) {
        
        int n=nums.length;
        int low=0;
        int mid=0;
        int high=n-1;
        
        while(mid<=high)
        {
            if(nums[mid]==2)
            {
                swap(nums,mid,high);
                high--;
            }
            else if(nums[mid]==0)
            {
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else
                mid++;
            
            }    
    }
    
    public void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}

// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
