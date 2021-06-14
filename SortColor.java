//Time Complexity - O(N)
//Space Complexity - O(1)

class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0) return;
        int low=0, mid=0;
        int high=nums.length-1;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                swap(mid,low,nums);
                mid++; low++;
            }
            else if(nums[mid]==2)
            {
                swap(mid,high,nums);
                high--;
            }
            else
            {
                mid++;
            }            
        }
    }

    public void swap(int i, int j, int[] nums)
    {
        int temp = nums[i];
        nums[i] = nums[j]; 
        nums[j] = temp;
    }
}
