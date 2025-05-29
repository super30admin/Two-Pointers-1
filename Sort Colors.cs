/*
  Time complexity: O(n)
  Space complexity: O(1)

  Code ran successfully on Leetcode: Yes

  Approach: The 0 elements are to the left and 2s are to the right with 1s in between. The left pointer should never cross the current pointer. Swapping the elements with these pointers leads to the result.

*/

public class Solution {
    public void SortColors(int[] nums) {
       int left = 0;
       int right = nums.Length-1;
        int current = 0;

        while(current<=right)
        {
            if(nums[current]==0)
            {
                swap(nums,left,current);
                left++;
                current++;
            }
            else
            if(nums[current]==2)
            {
                swap(nums,right,current);
                right--;
            }
            else
                current++;
        }
    }

    public void swap(int[] nums, int p1, int p2)
    {
        int temp = nums[p1];
        nums[p1] = nums[p2];
        nums[p2] = temp;
    }
}
