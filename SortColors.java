// Time Complexity : O(n), where n is the length of nums.
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No.


// Your code here along with comments explaining your approach
//l helps to keep a track of red, h tracks blue, while mid helps to keep track of white colored objects.

class Solution {
    public void sortColors(int[] nums) {
        if(nums==null||nums.length==0)
            return;
        int l =0;
        int h = nums.length-1;
        int mid = 0;
        while(mid<=h){
            if(nums[mid]==2){
                nums[mid] = nums[h];
                nums[h] =2;
                h--;
            }
            else if(nums[mid]==0){
                nums[mid]=nums[l];
                nums[l]=0;
                l++;
                mid++;
            }
            else
                mid++;
        }
    }
}