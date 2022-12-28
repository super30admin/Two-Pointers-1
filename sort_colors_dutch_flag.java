// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach: Since we know there are only 3 colors that needs to be sorted we can have two pointer approach where high is for 2 low is for 0 and mid is take care of 1, we can now iterate from mid to high since low and mid are at starting position and we have three conditions to check for, if the mid is 2 replace it with high, if the mid is 0 then we can swap low and mid and increment low and mid, or else if the mid is 1 we can just icrement the mid



class Solution {
    public void sortColors(int[] nums) {
        if (nums==null || nums.length==0) return;
        int low = 0; int mid=0;
        int high = nums.length - 1;

        while(mid<=high){
            if(nums[mid]==2){
                swap(nums, mid,high);
                high--;
            } else if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }else{
                mid++;
            }
        }
    }

    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}