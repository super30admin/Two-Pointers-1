// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public void sortColors(int[] nums) {
        int i=0, j=0, k=nums.length-1;
        while(j<=k){
            if(nums[j]==0){
               swap(nums, j, i);
               i++; j++; 
            }
            else if(nums[j]==2){
                swap(nums, j, k);
                k--;
            }
            else{
                j++;
            }
        }
        
    }
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
