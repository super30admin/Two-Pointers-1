// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// We use two pointers high and low and a moving pointer
// On moving the pointer, if we come across 0, we push it to the beginning of the array
// If we come across 2, we push it to the end

class Solution {
    private void swap(int[] nums, int i, int j){
        if(i==j) return;
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int m = low;
        while(m<=high){
            if(nums[m]==2)
            {swap(nums, m, high); high--;}
            else if(nums[m]==0)
            {swap(nums, m, low); low++; m++;}
            else if(nums[m]==1)
            {m++;}
        }
    }
}