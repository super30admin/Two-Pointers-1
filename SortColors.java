// Problem 75. Sort Colors
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
public class SortColors {
    public void sortColors(int[] nums) {
        int curr = 0;
        int left = 0;
        int right = nums.length-1;
        while(curr <= right){
            if(nums[curr] == 0){
                swap(nums, left, curr);
                left++;
                curr++;
            }else if(nums[curr] == 2){
                swap(nums, curr, right);
                right--;
            }else{
                curr++;
            }
        }
    }
    private void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
