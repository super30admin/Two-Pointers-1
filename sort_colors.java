// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Explaination : We use three pointers to sort the array in-place.
class Solution {
    public void sortColors(int[] nums) {
        int high = nums.length-1;
        int low = 0;
        int mid = 0;
        while(mid<=high){
            if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }else if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;
            }else mid++;
            
        }
    }

    private void swap(int[] nums, int m, int l){
        int temp;
        temp = nums[m];
        nums[m]= nums[l];
        nums[l]= temp;
    }
}