/**
## Problem1 (https://leetcode.com/problems/sort-colors/)
 
Time Complexity :   O (N) 
Space Complexity :  O (1) 
Did this code successfully run on Leetcode :    Yes (75. Sort Colors)
Any problem you faced while coding this :       No
 */

class SortColors {
    // Swap the cololrs
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length -1 ;
        int mid = 0;
        
        while(mid <= high){
            // check if mid is 2 (blue), if yes then swap with high
            if(nums[mid] == 2){
                swap(nums, mid, high);
                high--;
            }
            // check if mid is 0 (red), if yes then swap with low
            else if(nums[mid] == 0){
                swap(nums, mid, low);
                mid++;
                low++;
            }
            // else do nothing, keep 1 in the mid
            else{
                mid++;
            }
        }

        // print result
        for( int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String args[]) 
    { 
        SortColors obj = new SortColors();
        int[] nums = {2,0,2,1,1,0};
        obj.sortColors(nums);
    }
}