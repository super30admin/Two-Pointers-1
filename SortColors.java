// Time Complexity : O(n)
// Space Complexity : O(1)
public class SortColors {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0)
            return;
        
        int low = 0, mid = 0, high = nums.length-1;
        
        for(int i = 0 ; i < nums.length; i++)
        {
            if(nums[mid] == 0)
            {
                swap(nums, low, mid);
                low++;
                mid++;
            }
            else if (nums[mid] == 2)
            {
                swap(nums, high, mid);
                high--; 
                // do not increment mid as we need to check the value that is at position mid after swap.
            }
            else // nums[mid] == 1
            {
                mid++;
            }
        }
    }
    
    
    private void swap(int[]nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
     }
}
