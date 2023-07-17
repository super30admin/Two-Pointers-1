// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
// Your code here along with comments explaining your approach
//We have only three colors here represented by 0, 1 and 2. We will take low as 0, mid as 1 and high as 2. 
//We will keep 3 pointers low, high and mid in the array. low and mid are at index 0 and high is at the last index. 
//If we find 0 at mid pointer, then we swap it with low and increment both low and mid, and if we find 2 at mid we swap it with high and decrement high, otherwise we just increment mid.
class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0) return;
        int n=nums.length;
        int low=0,mid=0,high=n-1;
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
                mid++;
                low++;
            }
             
            else
            {
                mid++;
            }
        }
        
    }

    private void swap(int[]nums, int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}