//time - n
//space - constant

class Solution {
    public void sortColors(int[] nums) {

        int left = 0;
        int mid = 0;
        int right = nums.length-1;

        while(mid<=right)
        {
            if(nums[mid] == 0)
            {
                swap(mid,left,nums);
                left++;
                mid++;
            }
            else if(nums[mid] == 1)
            {
                mid++;
            }
            else
            {
                swap(mid,right,nums);
                right--;
            }
        }

    }

    private void swap(int i , int j , int[] nums )
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }


}
