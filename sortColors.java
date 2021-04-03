/*
runtime complexity - O(N) where N is the number of elements in the nums array
Space complexity - O(1) as we perform swaps within the same array
*/

class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int end=n-1;
        int start=0;
        for(int i=0;i<=end;i++)
        {
            if(nums[i]==0)
            {
                swap(nums,start,i);
                start++;
            }
            else if(nums[i]==2)
            {
                swap(nums,i,end);
                i--;
                end--;
            }
        }
    }
    public void swap(int[] nums, int a, int b)
    {
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}
