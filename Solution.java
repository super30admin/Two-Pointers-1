// Time Complexity :o(n)
// Space Complexity :o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length -1;
        int mid = 0;
        while(mid<=high)
        {
            if(nums[mid] == 1)
            {
                mid++;
            }
            else if(nums[mid] == 2)
            {
                swap(nums, mid, high);
                high--;
            }
            else if(nums[mid] == 0)
            {
                swap(nums, low, mid);
                low++;
                mid++;
            }
        }
        
    }
    private void swap(int[] nums,int i,int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
}