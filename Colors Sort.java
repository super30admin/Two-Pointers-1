// Time Complexity : O(N)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    private void swap(int[] nums,int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void sortColors(int[] nums) {
        int zero = 0;
        int mid = 0;
        int two = nums.length-1;
        while(mid <= two){
            if(nums[mid] == 0){
                swap(nums,zero,mid);
                zero++;
                mid++;
                
            }else if(nums[mid] == 1){
                mid++;
            }else{
                swap(nums,two,mid);
                two--;
            }
        }
    }
}
