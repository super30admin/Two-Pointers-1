// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public void sortColors(int[] nums) {
        if(nums.length==1) return;
        int low=0,high=nums.length-1,mid=0;
        while(mid <= high){
            if(nums[mid] == 0){ //collect all zeros at start
                swap(nums,mid,low);
                low++;
                mid++;
            } else if(nums[mid]==2){ //collect all 2s at the end
                swap(nums,mid,high);
                high--;
            } else mid++;
        }
    }
    private void swap(int[] nums,int a, int b){
        if(a==b) return;
        nums[a]=nums[a]+nums[b];
        nums[b]=nums[a]-nums[b];
        nums[a]=nums[a]-nums[b];
    }
}