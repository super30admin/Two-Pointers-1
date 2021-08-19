public class SortColors {

    public void sortColors(int[] nums) {

        if(nums==null || nums.length==0)
        {
            return;
        }

        int low=0,mid =0,high = nums.length-1;

        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid]==1)
            {
                mid++;

            }
            else if(nums[mid]==2)
            {

                swap(nums,mid,high);
                high--;

            }


        }
    }

    public void swap(int nums[],int idx1,int idx2)
    {
        int temp= nums[idx1];
        nums[idx1]=nums[idx2];
        nums[idx2]=temp;

    }
}