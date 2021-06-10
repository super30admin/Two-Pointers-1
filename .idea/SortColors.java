class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0)
            return;
        int left = 0;
        int mid =0;
        int right = nums.length - 1;
        while(mid <= right)
        {
            if(nums[mid]==0)
            {
                swap(nums, mid,left);
                left++;
                mid++;
            }
            else if(nums[mid]==1)
            {
                mid++;
            }
            else if(nums[mid]==2)
            {
                swap(nums, mid, right);
                right--;
            }
        }
    }
    private void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}

//time complexity is O(N)
//space complexity is O(1)