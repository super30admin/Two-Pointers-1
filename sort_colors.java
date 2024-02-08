//TC: O(n)
//SC: O(1)
class Solution {
    public void swap(int[] nums,int i,int j)
    {
        int  temp;
        temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public void sortColors(int[] nums) {
        Arrays.sort(nums);
        int low=0;
        int high=nums.length-1;
        int mid=0;
        while(mid<=high)
        {
            if(nums[mid]==2)
            {
                swap(nums,high,mid);
                high--;
            }
            else if(nums[mid]==0)
            {
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else
            {
                mid++;
            }
        }

    }
}