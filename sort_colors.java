// Time Complexity : O(N) one loop with nums elements
// Space Complexity : O(1) no extra space used
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : take 2 pointers: low gaurding 0, high gaurding 2, mid containing unprocessed elements. 
//Then compare elements of nums[mid]. If it's equal to 0, which is in low then swap and increment both pointers, if it's 1 then it's in-place so increment 
//just mid, if it's 2 then swap with nums[high] and decrement high. Don't increment mid because it has unprocessed element.


// Your code here along with comments explaining your approach


class Solution {
    public void sortColors(int[] nums) {
        
        int low = 0, high = nums.length -1, mid = 0;
        
        while(mid<=high){
            if(nums[mid] == 0){
                swap(nums, mid, low);
                low++;
                mid++;
            }else if(nums[mid] == 1){
                mid++;
            }else{//2
                swap(nums, mid, high);
                high--;
            } 

        }
    }
    
    private void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}