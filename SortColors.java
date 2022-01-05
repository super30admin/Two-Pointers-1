// Time Complexity :  o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach



class Solution {
    public void sortColors(int[] nums) {
        
        if(nums == null || nums.length == 0)
            return;
        
        int n = nums.length;
        int low = 0, high = n-1, mid = 0;
        
        while(mid <= high){
            
            if(nums[mid] == 0){
                swap(nums,low,mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 2){
                swap(nums,high,mid);
                high--;
            }else{
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