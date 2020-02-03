/* Sort colors */

/*Optimised approach - Two pointers */
// Time Complexity : O(N)
// Space Complexity : O(1) as its in place and we are not using any extra space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Ask the interviewer-Can we use sort function? Here we can't.
//So next, ask the interviewer can we count the occurences of 0,1,2 but here we can't as well
//secondly, we can use Two pointer approach
//1. Initialise low, mid and high pointers 
//2. we will store 0s in low, 1s in mid and 2s in high
//3. 3.1 if 1 comes at mid, increment mid
//3.2 if 0 comes at mid, swap mid and low values and, increment mid and low
//3.3 if 2 comes at mid, swap mid and high values, decrement high
//Terminating condition: high pointer can become equal to mid but once they crossed each other, terminate it

class Solution {
    public void sortColors(int[] nums) {
        //Edge case
        if(nums == null || nums.length == 0) return;
        //initialising low, mid and high pointers
        int low = 0;
        int mid = 0; 
        int high = nums.length - 1;
        //terminating condition
        while(mid <= high){
            //Case1) if 0 comes at mid, swap mid and low values
            //increment low and mid
            if(nums[mid] == 0){
                swap(nums, low, mid);
                low++; mid++;
            }
            //Case2) if 1 comes at mid, increment mid pointer 
            else if(nums[mid] == 1) {
                mid++;
            }
            //Case 3) 
            else {
                swap(nums, mid, high);
                high--;
            }
        }
    }
        //swap function
        private void swap(int[] nums, int i, int j){
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
}