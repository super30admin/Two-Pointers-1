// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        //if (nums ==  null || nums.length == 0) return new int[0];
        
        int low=0, mid=0, high=nums.length-1;
        while(mid <= high)
        {
            if(nums[mid] == 0){
                swap(nums, mid, low);
                mid++;
                low++;
            } else if(nums[mid] == 1){
                mid++;
            } else {
                swap(nums, mid, high);
                    high--;
            }
        }
    }
    private void swap(int nums[], int a, int b)
    {
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}