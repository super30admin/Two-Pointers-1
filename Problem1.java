// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//low, high and mid pointers where if mid encounters 2 it is swaped with high and 
//mid encounters 0 swap low and mid.
class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid=0;
        int high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }else if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;
            }else{
                mid++;
            }
        }
    }

    private void swap(int[] nums,int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}