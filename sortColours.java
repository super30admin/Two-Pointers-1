// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public void sortColors(int[] nums) {
       if(nums==null||nums.length==0)return;
       int left=0;
       int mid=0;
       int right=nums.length-1;

    while(mid<=right){
        if(nums[mid]==0){
            swap(nums,mid,left);
            left++;
            mid++;
        }else if(nums[mid]==2){
            swap(nums,mid,right);
            right--;
        }else{
            mid++;
        }
    }

    }
    private void swap(int [] nums,int i,int j){
        if(i!=j){
        nums[i]=nums[i]+nums[j];
        nums[j]=nums[i]-nums[j];
        nums[i]=nums[i]-nums[j];
        }
    }
}