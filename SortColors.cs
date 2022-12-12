// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

public class Solution {
    public void SortColors(int[] nums) {
        if(nums == null || nums.Length == 0) return;
        int low = 0;
        int high = nums.Length -1;
        int mid = 0;
        while(mid <= high)
        {
            if(nums[mid] == 2)
            {
                Swap(mid, high, nums);
                high--;
            }
            else if(nums[mid] == 0)
            {
                Swap(low, mid, nums);
                low++;
                mid++;
            }
            else
            {
                mid++;
            }
        }    
    }
    
    public void Swap(int i, int j, int[] nums)
    {
        var temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }
}
