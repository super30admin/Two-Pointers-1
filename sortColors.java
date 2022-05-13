// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public void sortColors(int[] nums) {
        //three pointers
        int low = 0;
        int high = nums.length-1;
        int mid = 0;
        while(mid<=high){
            if(nums[mid]==2){//if value of mid is 2 just swap with high pointer
                swap(nums,mid,high);
                high--;
                
            }
            else if(nums[mid]==0){//if its 0 swap with low pointer
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else{//if its 1 then no need to swap just keep where it is and increment pointer
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