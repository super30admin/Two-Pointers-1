// Time Complexity : O(n)
// Space Complexity : O(1) I have not used any extra space.
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: I used the same logic Jaspinder explained. 

class Solution {
    public void sortColors(int[] nums) {
        int low = 0, mid = 0;
        int high = nums.length - 1;

        while(mid <= high){
            if(nums[mid] == 2){
                swap(nums,mid,high);
                high--;
            }else if(nums[mid] == 0){
                swap(nums,mid,low);
                low++;
                mid++;
            }else{
                mid++;
            }
        }   
    }

    void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}