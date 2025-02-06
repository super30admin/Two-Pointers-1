class SortColors {
    public void sortColors(int[] nums) {
        int n= nums.length;
        int l=0;
        int r=n-1;
        int mid=0;
        while(mid <= r)
        {
            if(nums[mid]==2)
            {
                swap(nums,mid,r);
                r--;
            }
            else if(nums[mid]==0)
            {
                swap(nums,mid,l);
                l++;
                mid++;

            }
            else{
                mid++;
            }
        }

    }

    public void swap(int[] nums, int x, int y)
    {
        int temp = nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
}

//tc: O(n)
//sc: O(1)