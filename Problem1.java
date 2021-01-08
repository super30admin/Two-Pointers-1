class Solution {
    //Solve it using sort
    //Counting sort - count frquencies and prepare an o/p array
    /**
     * Time complexity - O(n)
     * Space complexity - O(1)
     Algorithm:
     1. We know 2 has to be in the last, 1 in middle and 0 at the beginning
     2. Intialize three pointers low, mid and high
     3. Intialize mid=low=0 and high = nums.length-1
     4. check if mid == 0 and if yes then swap it with low, increase mid by one and low by 1
     5. check if mid == 2 and if yes decrease high by 1
     **/
    public void sortColors(int[] nums) {
        if(nums==null||nums.length==0)
            return;
        int low = 0;
        int mid = low;
        int high = nums.length-1;
        while(mid<=high&&low<=high)
        {
            if(nums[mid]==0)
            {
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else if(nums[mid]==2)
            {
                swap(nums,mid,high);
                high--;
            }
            else
            {
                mid++;
            }
        }
    }
    public void swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}