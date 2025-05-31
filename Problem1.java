//Problem: Sort colors
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


class Solution {
    public void sortColors(int[] nums) {
        int n = nums .length;
        int low =0;
        int mid =0;
        int high =n-1;

        while(mid <= high){
            if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 0){
                swap(nums, mid, low);
                low++;
                mid++;
            }
            else{
                swap(nums, mid, high);
                high--;
            }
        }

    }

    public void swap(int[] nums, int mid, int lorh){
        int temp = nums[lorh];
        nums[lorh] = nums[mid];
        nums[mid] = temp;
    }
}