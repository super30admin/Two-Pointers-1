// Time Complexity :O(n) n is the array length;
// Space Complexity :O(1);
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length -1 ;
        int low =0; int mid = 0; int high = n;
        while(mid<=high){
            if(nums[mid] == 2){
                swap(nums,mid,high);
                high--;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                swap(nums,low,mid);
                mid++;
                low++;
            }
        }
    }
    
    public void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}