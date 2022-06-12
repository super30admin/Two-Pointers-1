// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :NO


// Your code here along with comments explaining your approach
/*
 * We are using three pointers. Low will collect all 0's. Mid will collect all 1's and high will collect all
 * 2's. We traverse using mid. If element at Low is < mid, then increment low else decrement high. If equal, increment
 * mid.
 */

public class SortColors {

    public static void sortColors(int[] nums) {
        if(nums.length == 0 || nums.length == 1)
        {
            return;
        }
        
        int start = 0;
        int end = nums.length - 1;
        int index = 0;
        
        while(start < end && index <= end)
        {
            if(nums[index] == 0)
            {
                nums[index] = nums[start];
                nums[start] = 0;
                start++;
                index++;                
            }
            
            else if(nums[index] == 2)
            {
                nums[index] = nums[end];
                nums[end] = 2;
                end--;
            }
            
            else{
                index++;
            }
        }
    }
    
}
