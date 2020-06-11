// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
/**
 * https://leetcode.com/problems/sort-colors/
 * Given an array with n objects colored red, white or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white and blue.

Here, we will use the integers 0, 1, and 2 to represent the color red, white, and blue respectively.

Note: You are not suppose to use the library's sort function for this problem.

Example:

Input: [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Follow up:

A rather straight forward solution is a two-pass algorithm using counting sort.
First, iterate the array counting number of 0's, 1's, and 2's, then overwrite array with total number of 0's, then 1's and followed by 2's.
Could you come up with a one-pass algorithm using only constant space?

Strategy: maintain 3 pointers: low, mid, high for 0, 1 and 2
 *
 */
class SortColors {
    
    //O(n) solution using 3 pointers
    public void sortColors(int[] nums) {
        
        if(nums == null || nums.length == 0) return;
        //all 0s at low, 1s at mid, 2s at high
        int low = 0, mid = 0, high = nums.length - 1;
        
        while(mid <= high) {
            
            //2 belongs to high, swap mid with high
            if(nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            /*
             if at mid we have 0, we should move it to low
             and increase low, also, there wont be any 2 at low
             as 2 has been already taken care by above condition
             so at low, we can have 0 or 1 which will come at mid after swap
             and hence we can confidently increase mid
            */    
            }else if(nums[mid] == 0) {
                swap(nums, low, mid);
                low++; mid++;   
            // 1 is valid number at mid, increase mid    
            }else if(nums[mid] == 1) {
                mid++;
            }
        }
    }
    
    private void swap(int[]nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    
     //counting sort simple solution
     public void sortColors1(int[] nums) {
        
        int[] count = new int[3];
        
        for(int a:nums) {
            count[a]++;
        }
        
        int k = 0;
        for(int i=0; i<3; i++){
            int p = 0;
            while(p < count[i]){
                nums[k] = i;
                p++;k++;
            }
        }
    }
}