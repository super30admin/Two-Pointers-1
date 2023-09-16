// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//Using 2 points apprach solving this problem
//taking 3 points left, mid, right and assigning it to left = 0, mid = 0, right = nums.length -1;
//checking until mid<=right and using swaping sorting an array
class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0) {
            return;
        }
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        while(mid<=right) {
            if(nums[mid] == 2) {
                swap(nums, mid, right);
                right --;
                }
            else if(nums[mid] == 0) {
                swap(nums, mid, left);
                left ++;
                mid ++;
                }
            else {
                mid ++;
        }

        }
        
        }
        
    private void swap(int[] nums, int m,int r) {
        int temp = nums[m];
        nums[m] = nums[r];
        nums[r] = temp;
            

        }



    
}