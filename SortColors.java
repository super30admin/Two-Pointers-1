## Problem1 (https://leetcode.com/problems/sort-colors/)

// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length -1;
        int curr = 0;
        int temp;
        while(curr <= high){
            // if the current pointer is 0, swap with low. Go to the next pointer.
            if(nums[curr] == 0){
                temp = nums[low];
                nums[low] = nums[curr];
                nums[curr] = temp;
                low++; curr++;
            }
            // if the current pointer is 2, swap with high. high --. 
            else if(nums[curr]==2){
                temp = nums[curr];
                nums[curr] = nums[high];
                nums[high] = temp;
                high --;
                
            } else{
            // Else if the current pointer is 1, move the current pointer.
                curr++;
            }
        }
    }
}