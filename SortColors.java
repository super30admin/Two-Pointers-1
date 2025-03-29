// Time Complexity: O(N)
// Space Complexity: O(1)
// Did this code successfully run on Leetcode: Yes
// Any problem you faced while coding this: No

// Approach:
// 1. Use two pointers, one to track the position for 0s and two to track the position for 2s.
// 2. Iterate through the array while i <= two:
//     If  nums[i] == 2, swap it with nums[two] and decrement two.
//     If  nums[i] == 0, swap it with nums[one] and increment one.
//     Move i forward in each iteration.
// 3. This ensures all 0s are at the beginning, 1s in the middle, and 2s at the end in a single pass.

class SortColors {
    public void sortColors(int[] nums) 
    {
        int i=0;
        int one = 0;
        int two= nums.length-1;
        while(i<=two)
        {
            if(nums[i] == 2)
            {
                while(nums[two]==2 && i<two)
                {
                    two--;
                }
                nums[i] = nums[two];
                nums[two] = 2;
            }
            if(nums[i] == 0)
            {
                while(i>one && nums[one] !=1)
                {
                    one++;
                }
                nums[i] = 1;
                nums[one] = 0;
            }
            i++;
        }    
    }
}
