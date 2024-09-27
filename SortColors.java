// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public void sortColors(int[] nums) {
       int low = 0, high = nums.length-1;
        
        for(int i=0; i<=high;){
            if(nums[i]==0){
                swap(nums,i,low);
                i++;
                low++; 
            }
            else if(nums[i]==1){
               i++;
            }
            else{
                swap(nums,i,high);
                high--;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}