// Time Complexity : o(n)
// Space Complexity : o(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no




// Your code here along with comments explaining your approach


class Solution {
    public void sortColors(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int mid=0;
        while(mid<=high){
            if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }else if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;
            }else{
                mid++;
            }
        }
    }
    private void swap(int[] nums,int var1,int var2){
        int temp=nums[var1];
        nums[var1]=nums[var2];
        nums[var2]=temp;
    }
}
