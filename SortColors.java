// Time Complexity : O(n) n is the length of array
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Two pointer approach by using low for 0, 1 for mid , high for 2
// low and mid start with 0 and move towards high, where high is the index of last position



class Solution {
    public void sortColors(int[] nums) {
        if(nums.length == 0 || nums.length==1) return;
        int low=0;int mid=0; int high=nums.length-1; 
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,low);
            mid++;low++;
            }
            else if(nums[mid]==2){
                swap(nums,mid,high); high--;
            }
            else{
                mid++;
            }
        }
        
    }
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}