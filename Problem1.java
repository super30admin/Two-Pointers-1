// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//we keep low pointer to keep track of 0,mid for 1 and high for 2
// we iterate through the array and swap elements to their correct positions using the three pointers
//after swaping we keep moving the pointers until mid crosses high

class Solution {
    public void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;
            }else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }else
                mid++;
        }
    }
    void swap(int nums[],int i,int j){
        int t=nums[i];
        nums[i]=nums[j];
        nums[j]=t;
    }
}