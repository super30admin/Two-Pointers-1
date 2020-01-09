// space: O(1)
// time: O(n)
// passed all testcase on leetcode
class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;
        while(mid<=high)
        {
            if(nums[mid]==0) // setting 0 on left
            {
                swap(nums,mid,low);
                mid++;
                low++;
                
            }
            else if(nums[mid]==1) // setting 1 on mid
            {
                mid++;
            }
            else{
                swap(nums,high,mid); // setting 2 on right
               // mid++;
                high--;
                
            }
        }
    }
    private void swap(int[] nums,int i,int j)
    {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}