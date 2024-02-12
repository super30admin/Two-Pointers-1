// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Three line explanation of solution in plain english  : Use 3 pointers to track zeros, ones, and twos.
// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        
        int low = 0; // to catch all zeroes
        int mid = 0; // to catch all ones
        int high = n-1; // to catch all twos

        while( mid <= high){
            int val = nums[mid];
            if(val == 2){
                swap(nums,mid,high);
                high--; // we fixed the value at high so move inward
            }
            else if( val == 0){
                swap(nums,mid,low);
                low++; // we fixed the value at low so move forward
                mid++; // we have already processed value at mid.
            }
            else{
                mid++;
            }
        }
    }

    private void swap(int[] nums, int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}