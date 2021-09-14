// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

//logic is to take 3 ptrs low, mid and high and at low we keep 0, mid 1,high 2
class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high = nums.length-1;
        // if mid crosses high that emans array is sorted
        while(mid<= high){
            //if the mid element has 2 then we need to move it to high and change the high pointer
            if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
                //here we are not doing mid++ cause as we are swapping the current 2 ele with other it might be 0 or 1. If we move mid++ then we might fail
                //[2,2,2,1,0,1,0,0] -> [0,0,1,1,0,2,2,2]
                //                        L     H M
            }
            // if mid is 0 then we need it to move to low and increase low and mid pointers cause there might be case where low and mid are at same points
            else if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            // if mid has 1 then its crct so mid++ to move to next elem
            else{
                mid++;
            }
        }
    }
    //swapping
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] =temp;
    }
}