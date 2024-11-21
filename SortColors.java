// Time Complexity : O(n) where n is length of array
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class SortColors {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = low;
        int high = nums.length-1;
        
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                //swap mid and low, move both ahead
                int t = nums[low]; nums[low]=nums[mid]; nums[mid] = t;
                low++;
                mid++;
            }
            else if(nums[mid]==1)
            {
                //move mid ahead
                mid++;
            }
            else
            {
                //swap mid and high, decrease high
                int t = nums[mid]; nums[mid]=nums[high]; nums[high] = t;
                high--;
            }
        }
        
    }
}