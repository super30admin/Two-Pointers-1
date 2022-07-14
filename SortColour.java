// time complexity 0(n)
// space complexity 0(1)
class Solution {
    public void sortColors(int[] nums) {
        if(nums.length==0 || nums==null)
            return;
        int low=0;
        int high=nums.length-1;
        int mid =0;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else
            {
                swap(nums,mid,high);
                high--;
            }
        }
    }
    private void swap(int[] nums, int i, int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}