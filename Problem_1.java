// Time Complexity : O(n) n is the length of array
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach
// Two pointer approach by using low for 0, 1 for mid , high for 2
// low and mid start with 0 and move towards high, where high is the index of last positions 
class Solution {
    public void sortColors(int[] nums) {
        int low=0, mid=0, high=nums.length-1;
        while( mid<=high){
            if(nums[mid]==1){
                mid++;
            }else if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }else{
                swap(nums, mid,high);
                high--;
            }
        }
    }
    private void swap(int[] nums,int i, int j){
        int temp =nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}