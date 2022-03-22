//Time Complexity ; O(n)
//Space Complexity : O(1)

class Solution {
    
    private void swap(int arr[],int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public void sortColors(int[] nums) {
        
        int low = 0;
        int mid = 0;
        int high = nums.length-1;
        
        while(mid<=high)
        {
            if(nums[mid]==2)
            {
                swap(nums,mid,high);
                high--;
            }
            else if(nums[mid]==0)
            {
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else
            {
                mid++;
            }
        }
    }
}