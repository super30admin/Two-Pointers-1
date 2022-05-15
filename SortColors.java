// Time Complexity :O(n) 
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :no

class Solution {
    public void sortColors(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int mid=0;
        while(mid<nums.length && mid<=right)
        {
            if(nums[mid]==0) //check if it is 0 and swap with left pointer but we dont know if its 1
            {
                swap(nums,left,mid);
                left++;
            }
            if(nums[mid]==2) //checking here if it is 1
            {
                swap(nums,right,mid);
                right--;
            }
            mid++; //this means mid is pointing to 1
        }
    }
    private void swap(int[] nums,int index1,int index2)
    {
        int temp=nums[index1];
        nums[index1]=nums[index2];
        nums[index2]=temp;
    }
}