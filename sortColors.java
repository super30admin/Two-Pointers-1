/*
 * Leet Code - 75
 */
class Solution {
    public int[] sortColors(int[] nums) {
        //2-pointer approach
        int start=0;
        int end=nums.length-1;
        int index=0;
        while(start<end && index <= end)
        {   
            if(nums[index] == 0)
            {
                nums=swap(nums,index,start);
                start++;
                index++;
            }
            else if(nums[index] == 2)
            {
                nums=swap(nums,index,end);
                end--;
            }
            else
            {
              index++; 
            }
        }
        return nums;
    }
    private int[] swap(int[] nums, int a, int b)
    {
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
        return nums;
    }
}