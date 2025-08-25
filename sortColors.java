// Time Complexity: O(n)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// did you face any problem while coding this : No

/**
 * All the high numbers (2s) are moved to the end of the array using the first if condition.
 * All the low numbers (0s) are moved to the beginning of the array using the second if condition.
 * The middle numbers (1s) remain in the middle.
 * Further each time a color is placed at the correct position, the pointers are adjusted accordingly.
 */

class sortColors {
    public void sortColors(int[] nums) {

        int mid=0;
        int low=0;
        int high=nums.length-1;

        while(mid<=high)
        {
            if(nums[mid]==2)
            {
                swap(mid,high,nums);
                high--;
                
            }
            else if(nums[mid]==0) 
            {
                swap(low,mid,nums);
                low++;
                mid++;
               
            }
            else
            {
                mid++;
            }
        
        }
    }

    private void swap(int a ,int b,int[] nums)
    {
        int temp=nums[b];
        nums[b]=nums[a];
        nums[a]=temp;
    }
   
}