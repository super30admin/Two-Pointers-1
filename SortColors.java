// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int l=0; int mid=0; int r=n-1;
        while(mid<=r){
            if(mid<=r && nums[mid]==0){
                swap(nums, l, mid);
                l++; mid++;
            } else if (mid<=r && nums[mid]==2){
                swap(nums, mid, r);
                r--;
            } else {
                mid++;
            }
        }
    }

    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
}