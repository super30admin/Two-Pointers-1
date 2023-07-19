//Sort Colours
//Time Complexity:O(n)
//Space Complexity:O(1)
class Solution {
    public void sortColors(int[] nums) {
        //3 pointers
        if(nums==null || nums.length==0)
        {
            return;
        }
        int low=0;//track 0's
        int high=nums.length-1;//track 2's
        int mid=0;//track 1's and move to left or right

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
    public void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

}