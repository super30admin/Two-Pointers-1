//Time Complexity: O(n)
//space complexity: O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No

class Solution {
    public void sortColors(int[] nums) {
        
        //z respresnt pointer monitoring 0's, 
        //r is running pointer that runs through the array --> also monitors 1's
        int z = 0, r=0;
        // t represents pointer monitoring 2's
        int t = nums.length-1;
        
        //while r pointer less than t pointer
        while(r<=t) {
            
            //if we encounter 2, then swap r and t; decrement t
            if(nums[r] == 2) {
                swap(nums,r,t);
                t--;
                //we do not increment r, coz there is a possibility of encountering 0's later
            } else if (nums[r] == 1) { // if we encounter 1, then increment r
                r++;
            } else if(nums[r] == 0) {//if we encounter 0, then swap r and z
                swap(nums, r,z);
                z++;
                r++;
            }
        }
    }
    
    private void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}