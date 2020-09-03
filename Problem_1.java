//Time-O(n)
//Space-O(1)
//My swap function isnt working for swapping the right part
class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0)
        {
            return; 
        }
        int l=0;
        int r=nums.length-1;
        int curr=0;
        while(curr<=r)
        {
            if(nums[curr]==0)
            {
                swap(nums,curr,l);
                /*nums[curr]=nums[curr]+nums[l];
                nums[l]=nums[l]-nums[curr];
                nums[curr]=nums[curr]-nums[l];*/
                l++;
                curr++;
            }
            else if(nums[curr]==1)
            {
                curr++;
            }
            else
            {
                swap(nums,curr,r);
                /*nums[curr]=nums[curr]+nums[r];
                nums[r]=nums[r]-nums[curr];
                nums[curr]=nums[curr]-nums[r];*/
                r--;
            }
        }
    }
    
    private void swap(int nums[],int i,int j)
    {
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
        
    }
}
