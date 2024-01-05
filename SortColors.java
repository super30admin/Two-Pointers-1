class Solution {
    public void sortColors(int[] nums) {
        int l = 0, m = 0, h = nums.length - 1;
        while(m<=h)
        {
            if(nums[m] == 0)
            {
                swap(nums, m++, l++);
            }
            else if(nums[m] == 1)
            {
                m++;
            }
            else
            {   
                swap(nums, m, h--);
            }

        }
    }
    private void swap(int nums[], int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}