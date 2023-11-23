// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Your code here along with comments explaining your approach
//## Problem1 (https://leetcode.com/problems/sort-colors/)
public class SortColors {
    public void sortColors(int[] nums) {
        // try it using three pointers  low mid and high checking for 0,1,2 respectively and do swapping(not with mid)

        int low = 0;
        int high = nums.length - 1;
        int mid = 0;

        while(mid <= high){
            if(nums[mid] == 2){
                swap(nums,mid,high);
                high--;
            }else if(nums[mid]==0){
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
