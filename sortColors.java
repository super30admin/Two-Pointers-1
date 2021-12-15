// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
/* we are using 3 pointers say low for 0, mid for 1 and high for 2 and trying to sort them.*/


class Solution {
    public void sortColors(int[] nums) {
        if(nums.length==0||nums==null)
            return;
        int mid=0,low=0,high=nums.length-1;
        while(mid<=high){

            if(nums[mid]==0){
                swap(low,mid,nums);
                low++;
                mid++;
            }
            else if(nums[mid]==2){
                swap(high,mid,nums);
                high--;
            }
            else
                mid++;
        }

    }
    public void swap(int x, int y,int[] nums){
        int temp=nums[x];
        nums[x]=nums[y];
        nums[y]=temp;
    }
}