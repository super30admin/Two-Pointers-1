// Time Complexity : O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public void sortColors(int[] nums) {
        int n= nums.length;
        int low=0, mid=0, high=n-1;
        for(int i=0; i<n;i++)
        {
            if(nums[mid] ==2)
            {
                swap(nums, mid, high);
                high--;
            }
            else if(nums[mid]==0){
                swap(nums, mid, low);
                low++; mid++;

            }
            else{
                mid++;
            }
        }
        
    }

    public void swap(int[] nums, int i, int j)
    {
        nums[i]= nums[i]+nums[j];
        nums[j]= nums[i]-nums[j];
        nums[i]= nums[i]-nums[j];
    }
}