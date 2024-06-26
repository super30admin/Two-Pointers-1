public class ArrangeColors
	{
        // Time Complexity : O(n)
        // Space Complexity : O(1)
        // Did this code successfully run on Leetcode : Yes
        // Any problem you faced while coding this : No
        public void SortColors(int[] nums)
        {
            if (nums == null || nums.Length == 0) return;
            int n = nums.Length;
            int low = 0;
            int mid = 0;
            int high = n - 1;
            while(high >= mid)
            {
                if (nums[mid] == 0)
                {
                    Swap(nums, low, mid);
                    low++;
                    mid++;
                }
                else if (nums[mid] == 2)
                {
                    Swap(nums, mid, high);
                    high--;
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
