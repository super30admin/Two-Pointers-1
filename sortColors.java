// Time Complexity : O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

After reading the problem the first intuition is that we only have to place 0 and 2 at the correct index and 1 will get to it's 
state along those steps. So, we gave two pointers at 0th index and last index i.e. start and end respectively. So, if we encounter 0
thge nums[start] = 0; and we increase the index and pointer moves to next number. Similarly if we encounter 2 we will place it at 
nums[end] and decrement the pointer. Otherwise, we will just increase the index.  


class Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length -1;
        
        int index = 0;
        
        while (index <= end && start < end )
        {
            if (nums[index] == 0)
            {
                nums[index] = nums[start];
                nums[start] = 0;
                start++;
                index++;
                
            }
            else if(nums[index]==2)
            {
                nums[index]= nums[end];
                nums[end] = 2;
                end--;
            }
            else
            {
                index++;
            }
        }
    }
}