public class problem1 {
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public void sortColor(int[] nums){
        int n= nums.length;
        int mid=0,low=0, high= n-1;

        while(mid<=high)
        {
            if (nums[mid]==2)
            {
                swap(nums,mid, high);
                high--;
            }
            else if(nums[mid]==0)
            {
                swap(nums, low, mid);
                low++;mid++;
            }
            else {
                mid++;
            }
        }

    }
    public void swap(int[] nums, int low, int high)
    {
        int temp= nums[low];
        nums[low]= nums[high];
        nums[high]= temp;
    }


}
