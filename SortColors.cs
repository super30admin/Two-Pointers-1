// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
https://leetcode.com/problems/sort-colors/submissions/

 public void SortColors(int[] nums) {
        
        if(nums == null || nums.Length == 0)
            return;
        
        //we will create three buckets, low, mid and high like dutch flag
        int left = 0;
        int mid = 0;
        int right = nums.Length - 1;
        
        while(mid <= right)
        {
            //if mid is red or 0, it suppose to go left side, swap with left element.
            if(nums[mid] == 0)
            {
                swap(nums, mid, left);
                left++;
                mid++;
            }
            //if mid is white or 1, it suppose to remain in middle , we jus increment middle to +1
            else if(nums[mid] == 1)
            {
                mid++;
            }
            //othereise mid is 2 or blue, it shud go to right side, swap with right element
            else
            {
                swap(nums, mid, right);
                right--;
            }
        }
    }
    
    private void swap(int[] nums, int low, int high)
    {
        int temp = nums[low];
        nums[low] = nums[high];
        nums[high] = temp;
    }