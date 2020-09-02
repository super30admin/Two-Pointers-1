// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Two pointer + index and swaps
class Solution {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0)
            return;
        
        int left = 0;
        int right =nums.length-1;
        int i=0;
        
        while(i<= right){
            if(nums[i]==0){
                swap(nums, left, i);
                left++;
                i++;
            }else if(nums[i] == 2){
                swap(nums, i, right);
                right--;
            }else if(nums[i]==1){
                i++;
            }
        }
    }
    
    private void swap(int nums[], int x, int y){
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}