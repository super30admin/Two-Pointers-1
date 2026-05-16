// Time Complexity : O(n) where n is the total length of nums array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

public class Solution {
    public void SortColors(int[] nums) {
        int slow = 0, mid = 0, fast = nums.Length - 1;

        while(mid <= fast)
        {
            if(nums[mid] == 2)
            {
                Swap(nums, mid, fast);
                fast--;
            }

            else if(nums[mid] == 0)
            {
                Swap(nums, slow, mid);
                slow++;
                mid++;
            }

            else
            {
                mid++;
            }
        }
    }

    public void Swap(int[] nums, int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}