/*
 * Time Complexity : O(n)
 * Space Complexity :  O(1)
 * Did this code successfully run on Leetcode : yes
 * Any problem you faced while coding this : No
 * 
 * Approach - We iterate through the loop with 3 pointers. The  low pointer keeps track of the 0th color, while the mid pointer keeps track of 1st color.
 * high keeps track of the 2nd color. If mid is 0 or 2, we swap it with low and high pointer respectively. We increment the mid pointer if mid points to 1. 
 */

//https://leetcode.com/problems/sort-colors/submissions/895642000/
class SortColors {
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

    private void swap(int[] nums,int i,int j) {
        int temp = nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}