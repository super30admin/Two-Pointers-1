public class Solution {
    public void SortColors(int[] nums) {
        int left=0;
        int mid=0;
        int right = nums.Length-1;
        while(mid<=right)
        {
            if(nums[mid]==2)
            {
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right] = temp;
                right--;
            }
            else if(nums[mid]==0)
            {
                int temp1 = nums[mid];
                nums[mid] = nums[left];
                nums[left] = temp1;
                mid++;
                left++;
            }
            else
            {
                mid++;
            }
        }

    }
}