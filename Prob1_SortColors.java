// Time Complexity : O(N)
// Space Complexity : O(1)

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approachclass Solution {


class Solution {
        public void sortColors(int[] nums) {
            if(nums == null || nums.length == 0)    return;
            
            int i = 0, j = nums.length - 1, mid = 0;
            
            while(mid <= j){
                if(nums[mid] == 2){ 
                    swap(nums, mid, j); //IF A[mid] = 2, swap A[mid] with A[j] and decrese j pointer by 1
                    j--;
                }
                else if(nums[mid] == 0){
                    swap(nums, mid, i); //IF A[mid] = 0, swap A[mid] with A[i] and increase i pointer and mid pointer by 1
                    i++; mid++;
                }
                else{
                    mid++;
                }
            }
            
        }
        public void swap(int[] nums, int i, int j){
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
}