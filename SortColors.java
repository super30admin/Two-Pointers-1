//SC: O(1)
//TC: O(n)
class Solution {
    public void sortColors(int[] nums) {
        int l =0 , r = nums.length-1, a=0;
        while(a<=r)
        {
            if(nums[a]==2)
            {
                swap(nums,a,r);
                --r;
            }
            else if (nums[a] ==1)
            {
                ++a;
            }
            else if (nums[a]==0)
            {
                swap(nums, a, l);
                ++a;
                ++l;
            }
        }

    }

    private void swap(int[] arr , int a , int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}