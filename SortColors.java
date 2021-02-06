// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
// use two pointers one to indicate insertion postion for 0's, one for 2's, iterate over array and swap if out of place

class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length<=1)
            return;
        
        int i=0, j=nums.length-1;
        int k=0;
        while(k<=j){
            if(nums[k]==2){
                swap(nums, k, j);
                j--;
            }
            else if(nums[k]==0){
                swap(nums, k, i);
                k++;
                i++;
            }
            else{
                k++;    
            }   
        }
    }
    
    private void swap(int[] nums, int k, int j){
        int temp;
        temp = nums[k];
        nums[k] = nums[j];
        nums[j] = temp;
    }
}