// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :NO

class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(low<=high && mid<=high)
        {
            if(nums[mid]==0)
            {
                int temp = nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                low=low+1;
                mid=mid+1;


            }
            else if(nums[mid]==2)
            {
                int temp = nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high=high-1;

            }
            else
            {

                mid=mid+1;
            }
        }
    }
}