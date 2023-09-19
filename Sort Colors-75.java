class Solution {
    // Time Complexity: O(n) where n is number of elements in the nums array
    // Space Complexity: O(1) constant space
    public void sortColors(int[] nums) {
        if(nums.length==0 || nums==null)
        {
            return;
        }
        int left = 0;
        int mid = 0;
        int right = nums.length-1; 
        while(mid<=right)
        {
            if(nums[mid]==2)
            {
                swap(nums,mid,right);
                right--;
            }
            else if(nums[mid]==0)
            {
                swap(nums,left,mid);
                left++;
                mid++;
            }
            else {
                mid++;
            }
        }
        
    }

    private void swap(int[] nums, int a, int b)
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp; 
    }

}
