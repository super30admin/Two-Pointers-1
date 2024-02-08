// ## Problem1 (https://leetcode.com/problems/sort-colors/)

// Time Complexity : O(N), where N is the number of elements in input array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

// To do in-place, we'll maintain three pointers
// low - keeps track of the next position to insert zero
// high - keeps track of the next position to insert two
// mid - used to traverse and swap elements

class Solution {
    private void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public void sortColors(int[] nums) {
        int low=0, mid=0;
        int high=nums.length-1;

        while(mid<=high){
            if(nums[mid]==2){
                // If a 2 is found, move it to the end by swapping with high
                swap(nums, mid, high);
                // Update high as current position contains a 2 now
                high--;
                // We still need to process the swapped element at mid, so
                // we do not update mid
            }else if(nums[mid]==1){
                // Update mid
                mid++;
            }else if(nums[mid]==0){
                // If a 0 is found, move it to front by swapping with low
                swap(nums, mid,low);
                // Update low  as current position now contains 0
                low++;
                // Update mid, as we already processed it when starting at low=0, mid=0
                mid++;
            }
        }

    }
}