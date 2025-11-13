// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

/*
* Maintain three pointers to keep track of each color. low -> 0, high -> 2, mid -> 1
* index will also help iterate through the array and map the elements to their appropriate positions 
*/

class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        //conditional movement of pointers, hence while loop
        while(mid <= high){
            if(nums[mid] == 0){
                // replace the index pointer element to the start pointer element and update start pointer element by 0 as 0 should be collected at the beginning of the array
                nums[mid] = nums[low];
                nums[low] = 0;
                low++;
                mid++;
            }
            // replace the index pointer element to the end pointer element and update end pointer element by 2 as 2 should be collected at the end of the array
            else if(nums[mid] == 2){
                nums[mid] = nums[high];
                nums[high] = 2;
                high--;
            }
            else{
                mid++;
            }
        }   
    }
}