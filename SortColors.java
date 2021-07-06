// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : 


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        //edge
        if( nums.length == 0 || nums.length == 1) return;
        
        int start = 0; // to keep zeros at the front
        int end = nums.length-1; // to keep 2's at the back
        int index = 0; // move along the current no.(1)
        
        while(index <= end && start < end){
            if(nums[index] == 0) { // swap to the fornt
               nums[index] = nums[start];
               nums[start] = 0;
                start++;
                index++;                
            }else if (nums[index] == 2){ // swap to the end
                nums[index] = nums[end];
                nums[end] = 2;
                end--;
            }else{
                index++; //if current element is 1, its automatically sorted
            }
        }
    }
}